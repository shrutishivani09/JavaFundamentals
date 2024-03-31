package oops;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

class Student{
    //Data Members
    int studentId;
    String studentName;
    int studentAge;
    Scanner sc = new Scanner(System.in);

    public void acceptDetails(){
        System.out.println("Enter Student Id : ");
        studentId = sc.nextInt();
        System.out.println("Enter Student Name : ");
        studentName = sc.next();
        System.out.println("Enter Student Age : ");
        studentAge = sc.nextInt();
    }

    public void dispalyDetails(){
        System.out.println("Student Id : "+studentId);
        System.out.println("Student Name : "+ studentName);
        System.out.println("Student Age : "+studentAge);
    }
}
public class ClassesAndObjectsExample {
    public static void main(String[] args) {
        //creating an object of Class Student
        Student student = new Student();
        student.acceptDetails();
        student.dispalyDetails();
    }
}