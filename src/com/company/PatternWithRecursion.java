package com.company;

public class PatternWithRecursion {
    static void pattern(int n){
        if(n>0){
            pattern(n-1);
            for (int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
        else{
            System.out.println("type again"); //why does it not print
        }
            }
    public static void main(String[] args) {
        pattern(4);
    }
}
