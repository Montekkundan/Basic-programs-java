package com.company;
import java.util.Scanner;
public class FactorialWithForLoop {
    public static void main(String[] args) {
        int b =1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to finds its factorial: ");
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            b*=i;
        }
        System.out.printf("The factorial of %d is %d. ", a , b);
    }
}
