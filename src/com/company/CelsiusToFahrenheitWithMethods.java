package com.company;

public class CelsiusToFahrenheitWithMethods {
    static void convert(float a){
        if (a ==0)
        {
            System.out.println("32 Fahrenheit");
        }
        else {
            float f = (a * 9 / 5) + 32 ;
            System.out.println(f+" Fahrenheit");

        }
    }
    //float fahrenheit=0;
    //fahrenheit=((a*9)/5)+32;
    //System.out.format("%d celsius to fahrenheit is %d. ",a,fahrenheit);

    public static void main(String[] args) {
        convert(100);

    }
}
