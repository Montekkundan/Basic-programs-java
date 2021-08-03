package com.company;
import java.util.Scanner;
public class FindDoubleTripleSpace {
    public static void main(String[] args) {
        System.out.println("Enter a sentence to find double or triple spaces");
        Scanner sc = new Scanner(System.in);
        String a= sc.nextLine();
        System.out.println("Index of double space ="+ a.indexOf("  "));
        System.out.println("Index of triple space ="+ a.indexOf("   "));
    }
}
