package com.company;
import java.util.Scanner;
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class Square_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Square one=new Square();
        System.out.println("Enter the side of the square..");
        int a=sc.nextInt();
        one.side= a;
        System.out.println("Area of the square- "+one.area());
        System.out.println("Perimeter of the square- "+one.perimeter());
    }
}
