package com.shree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner angle = new Scanner(System.in);
        System.out.println("Checking if triangle is valid or not");

        System.out.println("Enter the 1st angle");
        int a=angle.nextInt();

        System.out.println("Enter the 2nd angle");
        int b=angle.nextInt();

        System.out.println("Enter the 3rd angle");
        int c=angle.nextInt();

        if(a+b+c==180 && a!=0 && b!=0 && c!=0)
            System.out.println("Triangle is Valid");

        else
            System.out.println("Triangle is Not valid");
    }
}
