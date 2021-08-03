package com.company;
import java.util.Scanner;
class Rectangle{
    int l;
    int b;
    public int area(){
        return l*b;
    }
    public int perimeter(){
        return 2*(l+b);
    }
}
public class Rectangle_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Rectangle one=new Rectangle();
        System.out.println("Enter the length of the rectangle..");
        int a=sc.nextInt();
        one.l= a;
        System.out.println("Enter the breath of the rectangle..");
        int x=sc.nextInt();
        one.b= x;
        System.out.println("Area of the rectangle- "+one.area());
        System.out.println("Perimeter of the rectangle- "+one.perimeter());
    }
}
