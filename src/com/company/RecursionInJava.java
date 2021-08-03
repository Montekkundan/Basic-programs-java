package com.company;

public class RecursionInJava {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    static int factorial_iteration(int n){
        int product =1;
        if(n==0 || n==1){
            return 1;
        }
        else{
            for(int i=1;i<=n;i++){
                product *= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        int x=4;
        System.out.println("The value of factorial x is = " + factorial(x));
    }
}
