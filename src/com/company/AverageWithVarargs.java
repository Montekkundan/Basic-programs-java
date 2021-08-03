package com.company;

public class AverageWithVarargs {
    static int sum(int ...arr){
        // Available as int [] arr
        int result=0;
        int x=arr.length;
            int sum=0;
            for(int a: arr){
            sum+=a;
            }
            result=sum/x;
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The average is: " + sum(1, 2, 3, 4,5));
    }
}
