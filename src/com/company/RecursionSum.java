package com.company;

public class RecursionSum {
    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        int x=4;
        System.out.println("The value of factorial x is = " + sum(x));
    }
}
