package com.company;
import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("The sum of the two inputs is = "+ (a+b));
    }
}
