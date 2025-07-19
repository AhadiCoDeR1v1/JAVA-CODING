import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.io.IOException;
import java.io.*;

public class Mangementsystem {
    private ArrayList<Date> datearr = new ArrayList<>();
    Mangementsystem() {

    }
    public void start() throws IOException, ClassNotFoundException {
        File file = new File("MilkData.ser");
        System.out.println("Welcome to Milk Management System");
        System.out.println("Main Menu");
        System.out.println("1. Add Milk");
        System.out.println("2. Remove Milk");
        System.out.println("3. List Milks");
        System.out.println("4. Quit");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        int count = 0;
        while(choice!=4) {
            if(count!=0){
                System.out.println("Main Menu");
                System.out.println("1. Add Milk");
                System.out.println("2. Remove Milk");
                System.out.println("3. List Milks");
                System.out.println("4. Quit");
                System.out.println("Enter your choice");
                choice = sc.nextInt();
            }
            count++;
            switch (choice) {

                case 1:
                    // Read previous data
                    if (file.exists()) {
                        FileInputStream fisRead = new FileInputStream(file);
                        ObjectInputStream oisRead = new ObjectInputStream(fisRead);
                        datearr = (ArrayList<Date>) oisRead.readObject();
                        oisRead.close();
                        fisRead.close();
                    }

                    System.out.println("Enter Name:");
                    String name = sc.next();
                    System.out.println("Enter Cast:");
                    String cast = sc.next();
                    System.out.println("Enter Rate:");
                    double rate = sc.nextDouble();
                    System.out.println("Enter Milk in KG:");
                    int milk = sc.nextInt();
                    System.out.println("Enter Current Year");
                    int cy = sc.nextInt();
                    System.out.println("Enter Current Month");
                    int cm = sc.nextInt();
                    System.out.println("Enter Current Day");
                    int cd = sc.nextInt();

                    Person p = new Person(name, cast);
                    Milk m = new Milk(milk, rate, p);
                    Date d = new Date();
                    d.setCurrentDay(cd);
                    d.setCurrentMonth(cm);
                    d.setCurrentYear(cy);
                    d.insertMilk(m);  // insert only one milk
                    addDates(d);      // will merge if date already exists

                    // Save updated list
                    FileOutputStream fosWrite = new FileOutputStream(file);
                    ObjectOutputStream oosWrite = new ObjectOutputStream(fosWrite);
                    oosWrite.writeObject(datearr);
                    oosWrite.close();
                    fosWrite.close();

                    System.out.println("Milk added successfully.");
                    break;

                case 2:
                    System.out.println("Enter Name:");
                    String namer = sc.next();
                    System.out.println("Enter Cast:");
                    String castr = sc.next();
                    System.out.println("Enter Rate:");
                    double rater = sc.nextInt();
                    System.out.println("Enter Milk in KG:");
                    int milkr = sc.nextInt();
                    System.out.println("Enter Current Year");
                    int cyr = sc.nextInt();
                    System.out.println("Enter Current Month");
                    int cmr = sc.nextInt();
                    System.out.println("Enter Current Day");
                    int cdr = sc.nextInt();
                    FileInputStream fis0 = new FileInputStream(file);
                    ObjectInputStream ois0 = new ObjectInputStream(fis0);
                    ArrayList<Date> datearr = (ArrayList<Date>) ois0.readObject();
                    Person p1 = new Person(namer, castr);
                    Milk m1 = new Milk(milkr, rater, p1);
                    Date da = new Date();
                    da.setPerson(p1);
                    da.setCurrentYear(cyr);
                    da.setCurrentMonth(cmr);
                    da.setCurrentDay(cdr);
                    da.insertMilk(m1);

                    int len3 = datearr.size();
                    boolean removed = false;
                    if (len3 == 0) {
                        System.out.println("No milks in MilkData.txt");
                    } else {
                        for (int i = 0; i < len3; i++) {
                            if (datearr.get(i).getCurrentYear()==da.getCurrentYear() && datearr.get(i).getCurrentMonth()==da.getCurrentMonth() && datearr.get(i).getCurrentDay()==da.getCurrentDay() && datearr.get(i).getPerson().getName().equals(p1.getName()) && datearr.get(i).getPerson().getCast().equals(p1.getCast())) {
                                datearr.remove(i);
                                System.out.println("Milks removed Successfully");
                                FileOutputStream fos1 = new FileOutputStream(file);
                                ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
                                oos1.writeObject(datearr);
                                oos1.close();
                                fos1.close();
                                removed = true;
                                break;
                            }
                        }
                        if (removed == false) {
                            System.out.println("No milks in MilkData.txt");
                        }
                    }
                    fis0.close();
                    ois0.close();
                    break;
                case 3:
                    FileInputStream fis2 = new FileInputStream(file);
                    ObjectInputStream ois2 = new ObjectInputStream(fis2);
                    datearr = (ArrayList<Date>) ois2.readObject();
                    int len2 = datearr.size();
                    System.out.println("Name   Cast   Milk   Rate   Day   Month   Year");
                    for (int i = 0; i < len2; i++) {
                        Date d1 = datearr.get(i);
                        for (Milk milk1 : d1.getM()) {
                            System.out.println(
                                    milk1.getPerson().getName() + "   " +
                                            milk1.getPerson().getCast() + "   " +
                                            milk1.getTotalinKg() + "   " +
                                            milk1.getRate() + "   " +
                                            d1.getCurrentDay() + "   " +
                                            d1.getCurrentMonth() + "   " +
                                            d1.getCurrentYear()
                            );
                        }
                    }
                    fis2.close();
                    ois2.close();
                    break;

            }
        }
    }
    public void addDates(Date d) {
        boolean found = false;
        for (Date existingDate : datearr) {
            if (existingDate.getCurrentDay() == d.getCurrentDay() &&
                    existingDate.getCurrentMonth() == d.getCurrentMonth() &&
                    existingDate.getCurrentYear() == d.getCurrentYear()) {
                // Just add all new milks from d into existing date
                for (Milk milk : d.getM()) {
                    existingDate.insertMilk(milk);
                }
                found = true;
                break;
            }
        }
        if (!found) {
            datearr.add(d);  // Add new date if not found
        }
    }

}
