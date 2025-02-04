package generics_ArrayList.Compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class main {
    public static void main(String[] args) {
        Student ahad = new Student(75,12);
        Student adam = new Student(95,14);
        Student bob = new Student(86,15);
        Student bob1 = new Student(99,17);
        Student bob2 = new Student(80,10);

        Student[] array= {ahad,adam,bob,bob1,bob2};
        Arrays.sort(array,new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int diff=(int)o1.rollno-o2.rollno;
                return diff;
            }
        });
        System.out.println(Arrays.toString(array));

//        if (ahad.compareTo(adam)<1){
//            System.out.println("Ahad has less marks than adam");
//        }
    }
}
