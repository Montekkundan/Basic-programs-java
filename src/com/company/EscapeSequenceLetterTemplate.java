package com.company;
import java.util.Scanner;
public class EscapeSequenceLetterTemplate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your name to insert it into the sentence: ");
        String a= sc.nextLine();
        System.out.println("Dear "+ a +" \n\tThis is a Java program. \nThanks for reading!");

    }
}
