package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1,num2,sum;
        double Average;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter First Temprature");
        num1=keyboard.nextInt();

        System.out.println("Enter Second Temprature");
        num2=keyboard.nextInt();

        sum=num1+num2;
        Average=(double)((num1+num2)/2);
        System.out.println("Sum : " +sum +"\nAverage : " +Average);
	// write your code here
    }
}
