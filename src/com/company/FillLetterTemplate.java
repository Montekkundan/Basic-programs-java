package com.company;
import java.util.Scanner;
public class FillLetterTemplate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letter= "Dear <|name|>, Thanks a lot";
        System.out.println("The template for letter is ="+ letter);
        System.out.println("Type your name to insert it into the sentence: ");
        String a= sc.nextLine();
        System.out.println("Output= \n"+ letter.replace("<|name|>",a));
    }
}


