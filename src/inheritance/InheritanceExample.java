package inheritance;

import java.util.Scanner;

class Student{
    //Data Members
    int studentId;
    String studentName;
    int studentAge;
    Scanner sc = new Scanner(System.in);

    void acceptDetails(){
        System.out.println("Enter Student Id : ");
        studentId = sc.nextInt();
        System.out.println("Enter Student Name : ");
        studentName = sc.next();
        System.out.println("Enter Student Age : ");
        studentAge = sc.nextInt();
    }

   void dispalyDetails(){
        System.out.println("Student Id : "+studentId);
        System.out.println("Student Name : "+ studentName);
        System.out.println("Student Age : "+studentAge);
    }
}

class Marks extends Student{
    private float objectiveMarks;
    private float subjectiveMarks;
    void acceptDetails(){
        super.acceptDetails();
        System.out.println("Enter Objectuve Marks");
        objectiveMarks = sc.nextFloat();
        System.out.println("Eneter Subjective Marks");
        subjectiveMarks = sc.nextFloat();
    }
    public void dispalyDetails(){
        super.dispalyDetails();
        System.out.println("Objective Marks : "+objectiveMarks);
        System.out.println("Subjective Marks : "+ subjectiveMarks);
    }
}
public class InheritanceExample {
    public static void main(String[] args){

        Marks marks = new Marks();
        marks.acceptDetails();

        marks.dispalyDetails();

    }
}
