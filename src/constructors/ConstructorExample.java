package constructors;

import java.util.Scanner;

class Student{
    //Data Members
    private int studentId;
    private String studentName;
    private int studentAge;

    public Student(){
        this.studentId = 100;
        this.studentName = "Shruti";
        this.studentAge = 18;
    }

    public Student(int sId, String sName, int sAge){
        this.studentId = sId;
        this.studentName = sName;
        this.studentAge = sAge;
    }
    public void dispalyDetails(){
        System.out.println("Student Id : "+studentId);
        System.out.println("Student Name : "+ studentName);
        System.out.println("Student Age : "+studentAge);
    }
}
public class ConstructorExample {
    public static void main(String[] args){
        Student student = new Student();  //calling constructor
        student.dispalyDetails();

        Student student1 = new Student(101, "Shivani", 18);
        student1.dispalyDetails();
    }
}
