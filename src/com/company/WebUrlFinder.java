package com.company;
import java.util.Scanner;
public class WebUrlFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the url of the website to find the detail of it.");
        String a= sc.nextLine();
        if(a.endsWith("com")){
            System.out.println("Commercial website ");
        }
        else if(a.endsWith("org")){
            System.out.println("Organisation website");
        }
        else if(a.endsWith("in")){
            System.out.println("Indian website");
        }
        else
            System.out.println("Wrong input.");
    }
}
