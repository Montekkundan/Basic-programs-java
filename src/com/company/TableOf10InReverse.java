package com.company;

public class TableOf10InReverse {
    public static void main(String[] args) {
        int a=10;
        for(int i=10;i>=0;i--){
            System.out.printf("%d x %d = %d\n" , a , i , a*i);
        }
    }
}
