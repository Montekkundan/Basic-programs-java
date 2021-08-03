package com.company;
import java.util.Scanner;
public class GreetingUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name.");
        String str = sc.nextLine();
        System.out.println("Hello "+ str+ ", have a good day!");
    }
}
