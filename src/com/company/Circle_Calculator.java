package com.company;
import java.util.Scanner;
class Circle{
    double radius;
    public double area(){
        return (3.14*radius*radius);
    }
    public double circumference(){
        return 2*3.14*radius;
    }
}
public class Circle_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Circle one=new Circle();
        System.out.println("Enter the radius of the circle..");
        int a=sc.nextInt();
        one.radius=a;
        System.out.println("Area of the circle- "+one.area());
        System.out.println("Circumference of the circle- "+one.circumference());
    }
}
