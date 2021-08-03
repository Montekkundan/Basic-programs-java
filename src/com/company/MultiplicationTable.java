package com.company;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number you want the table of: ");
        int a = sc.nextInt();
        System.out.println("Enter the length of the multiplication table:");
        int b = sc.nextInt();
        for(int i = 1; i<=b;i++) {
            System.out.printf("%d x %d = %d\n" , a , i , a*i);
        }
    }
}
