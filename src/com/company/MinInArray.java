package com.company;

public class MinInArray {
    public static void main(String[] args) {
        int arr [] ={-1,2,3,4,5};
        int min = 0;
        for(int e:arr){
            if(e<min){
                min=e;
            }
        }
        System.out.println("The minimum value in the array is: "+ min);
    }
}
