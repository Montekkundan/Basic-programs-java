package com.company;
import java.util.Scanner;
public class SumOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        System.out.println("Enter the range for the even numbers");
        int a =sc.nextInt();
        for(int i=0;i<=a;i+=2){
            sum += i;
        }
        System.out.println("The sum of all even numbers is = "+ sum);
    }
}
