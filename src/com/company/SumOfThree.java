package com.company;
import java.util.Scanner;
public class SumOfThree {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.println("This is a program to sum three inputs of user.");
        System.out.println("Enter first input");
        Double a= sc.nextDouble();
        System.out.println("Enter second input");
        Double b= sc.nextDouble();
        System.out.println("Enter third input");
        Double c= sc.nextDouble();
        System.out.println("The sum of the three inputs by the user is = "+ (a+b+c));
    }
}
