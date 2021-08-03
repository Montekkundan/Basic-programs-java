package com.company;
import java.util.Scanner;
public class BoardPercentageCal {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println("Enter marks in Maths subject");
        Double a = sc.nextDouble();
        System.out.println("Enter marks in Physics subject");
        Double b = sc.nextDouble();
        System.out.println("Enter marks in Chemistry subject");
        Double c = sc.nextDouble();
        System.out.println("Enter marks in English subject");
        Double d = sc.nextDouble();
        System.out.println("Enter marks in Computer subject");
        Double e = sc.nextDouble();
        Double p= ((a+b+c+d+e)/500)*100;
        System.out.println("Percentage of "+ str + " is = "+ p);
    }
}
