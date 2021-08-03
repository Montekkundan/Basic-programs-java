package com.company;
import java.util.Scanner;
public class IsInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you number");
        System.out.println(scanner.hasNextInt());
    }
}
