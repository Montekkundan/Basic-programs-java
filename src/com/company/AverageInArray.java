package com.company;

public class AverageInArray {
    public static void main(String[] args) {
        float [] marks = {34.5f, 56.7f, 46.5f, 64.4f, 87.4f};
        float sum=0;
        for (float element:marks){
            sum=sum+element;
        }
        System.out.println("The average marks of float numbers is: "+sum/marks.length);
    }
}
