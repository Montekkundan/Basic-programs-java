package com.company;
import java.util.Scanner;
public class ChangeToLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input, to change it into lower case.");
        String a= sc.nextLine();
        System.out.println("Output= "+ a.toLowerCase());
    }
}
