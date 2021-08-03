package com.company;
import java.util.Scanner;
public class CgpaOutOf100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String str= sc.nextLine();
        System.out.println("Enter marks in First subject");
        Double a = sc.nextDouble();
        System.out.println("Enter marks in Second subject");
        Double b = sc.nextDouble();
        System.out.println("Enter marks in Third subject");
        Double c = sc.nextDouble();
        Double cgpa= (a+b+c)/30;
        System.out.println("CGPA of "+ str + " is = "+ cgpa);
    }
}
