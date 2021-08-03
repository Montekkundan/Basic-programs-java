package com.company;
import java.util.Scanner;
public class Tax {
    public static void main(String[] args) {
        float tax=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your yearly income in lakhs.");
        float a = sc.nextFloat();
        if(a<=2.5f)
        {
            tax=tax+0;
        }
        else if(a>2.5f && a<=5.0f){
            tax= tax+ 0.05f*(a-2.5f);
        }
        else if(a>5.0f && a<=10.0f){
            tax= tax+ 0.05f*(5.0f-2.5f);
            tax= tax+ 0.2f*(a-5.0f);
        }
        else if(a>10.0f){
            tax= tax+ 0.05f*(5.0f-2.5f);
            tax= tax+ 0.2f*(10.0f-5.0f);
            tax= tax+ 0.3f*(a-10.0f);
        }
        System.out.println("The total tax paid is : "+ tax);
    }
}
