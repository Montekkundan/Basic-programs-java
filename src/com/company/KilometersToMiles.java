package com.company;
import java.util.Scanner;
public class KilometersToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter units in Kilometers");
        Double a= sc.nextDouble();
        Double b= a * 0.62137;
        System.out.println(a+" km changed to miles is = " + b +" miles.");
    }
}
