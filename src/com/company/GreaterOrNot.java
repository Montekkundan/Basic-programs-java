package com.company;
import java.util.Scanner;
public class GreaterOrNot {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a>8);
    }
}
