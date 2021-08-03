package com.company;

public class NumberIsOrNotInArray {
    public static void main(String[] args) {
        float [] marks = {34.5f, 56.7f, 46.5f, 64.4f, 87.4f};
        float num=34.5f;
        boolean isInArray=false;
        for (float element:marks) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
           if(isInArray){
               System.out.println("The value is present in the array ");
           }
           else {
               System.out.println("The value is not present in the array ");
           }
    }
}
