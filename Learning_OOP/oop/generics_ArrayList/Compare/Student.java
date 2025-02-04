package generics_ArrayList.Compare;

public class Student implements Comparable<Student> {
    int marks;
    int rollno;
    public Student(int marks,int rollno){
         this.marks= marks;
         this.rollno=rollno;
    }
    public String toString(){
        return marks+" "+rollno;
    }


    @Override
    public int compareTo(Student o) {
        int diff=(int)this.marks-o.marks;
        return diff;
    }



}

