package com.company;
import java.util.Scanner;
public class PassOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to check whether you passed or failed!");
        System.out.println("Enter Marks in Subject 1:");
        Double a = sc.nextDouble();
        System.out.println("Enter Marks in Subject 2:");
        Double b = sc.nextDouble();
        System.out.println("Enter Marks in Subject 3:");
        Double c = sc.nextDouble();
        Double total = ((a+b+c)/300)*100;
        System.out.println("Your overall percentage is : "+total+" %" );
        if(total>40) {
            if(a>33 && b>33 && c>33)
                System.out.println("Passed!");
            else
                System.out.println("Sorry you failed!");
        }
        else
            System.out.println("Sorry you failed!");
    }
}
