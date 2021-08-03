package com.company;

public class FloatArray {
    public static void main(String[] args) {
        float [] marks = {34.5f, 56.7f, 46.5f, 64.4f, 87.4f};
        float sum=0;
        for (float element:marks){
            sum=sum+element;
        }
        System.out.println("The value of sum of float numbers is: "+sum);
    }
}
