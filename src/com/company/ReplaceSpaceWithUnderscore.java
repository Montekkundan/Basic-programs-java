package com.company;
import java.util.Scanner;
public class ReplaceSpaceWithUnderscore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence to replace its spaces with underscore.");
        String a= sc.nextLine();
        System.out.println("Output=  "+ a.replace(" ","_"));

    }
}
