package com.company;

public class VarargsInJava {
    /* static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
    static int sum(int a, int b, int c, int d){
        return a+b+c+d;
    } */

    static int sum(int ...arr){
        // Available as int [] arr
        int result=0;
        for (int a:arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 1 and 2 is: " +sum(1,2));
        System.out.println("The sum of 1, 4 and 2 is: " +sum(1,4,2));
        System.out.println("The sum of 1, 4, 9 and 2 is: " +sum(1,4,9,2));
    }
}
