package com.Company;

import java.util.Scanner;

class Student{
    int rollNo;
    String Name;
    int Class;
    String Division;
    int nextRollNo;

    Student(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        Name= sc.next();
        System.out.println("Enter roll no: ");
        rollNo = sc.nextInt();
        System.out.println("Enter the class: ");
        Class=sc.nextInt();
        System.out.println("Enter the division: ");
        Division = sc.next();

    }
    void show(){
        System.out.println("Student roll no is: "+ rollNo);
        System.out.println("Student name is: "+ Name);
        System.out.println("Student class is: "+ Class);
        System.out.println("Student Division is: "+ Division);
    }
    void showNextRollNo(){
        nextRollNo = rollNo+1;
        System.out.println("");
        System.out.println("Next roll number is:"+ nextRollNo);
    }

}
public class Main {

    public static void main(String[] args) {

    Student stud = new Student();
    stud.show();
    stud.showNextRollNo();
    }
}
