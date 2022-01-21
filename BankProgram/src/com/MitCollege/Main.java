package com.MitCollege;

import java.util.Scanner;

class Account{
    String name;
    int accountNumber;
    int balance;

    Account(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of account holder: ");
        name = sc.next();
        System.out.println("Enter the account number: ");
        accountNumber = sc.nextInt();
        balance=100000;
    }
    void viewAccountDetail(){
        System.out.println("Yor account details are: ");
        System.out.println("Your name is " + name);
        System.out.println("Your account number is: "+ accountNumber);
        System.out.println("Your Balance is "+ balance);
    }

    void deposit(int amt){
        balance=balance+amt;
        System.out.println("Balance after deposit is: "+ balance);
    }

    void withdraw(int amt){
        balance=balance-amt;
        System.out.println("Balance after withdrawl is: "+ balance);
    }

}
public class Main {

    public static void main(String[] args) {
        int choice,amount;
        Scanner ch = new Scanner(System.in);
        Account a1 = new Account();

        System.out.println("Press 1-Deposite");
        System.out.println("Press 2-Withdrawl");
        System.out.println("Press 3-View Account Details");
        System.out.println("Press 4-Exit");
        System.out.println("Enter your choice");
        choice = ch.nextInt();

        switch (choice){
            case 1:
                System.out.println("Enter the amount");
                amount = ch.nextInt();
                a1.deposit(amount);
                break;

            case 2:
                System.out.println("Enter the amount");
                amount = ch.nextInt();
                a1.withdraw(amount);
                break;

            case 3:
                a1.viewAccountDetail();
                break;

            case 4:
                break;

            default:
                System.out.println("Wrong Choice.. Please enter vaild choice");
                
        }
        System.out.println("Thank You!!");
    }
}
