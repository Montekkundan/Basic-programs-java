package com.company;
import java.util.Scanner;
public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year, to find out whether it is a leap year or not!");
        int a = sc.nextInt();
        if(a%4==0){
            if(a%100==0 && a%400==0)
                System.out.println(a +" is a leap year!");
            else if(a%100==0 && a%400!=0)
                System.out.println(a +" is a not leap year!");
            else
                System.out.println(a +" is a not leap year!");
        }
    }
}
