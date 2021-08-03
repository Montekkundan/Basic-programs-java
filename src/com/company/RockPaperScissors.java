package com.company;
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random play= new Random();
        System.out.println("Best of three of Rock paper scissors!");
        int win=0;
        int i =1;
        while(i<=3){
            int number=play.nextInt(3);
            System.out.println("Press 1 for Rock");
            System.out.println("Press 2 for Paper");
            System.out.println("Press 3 for Scissor");
            int ch=scanner.nextInt();
            if(number==1)
                System.out.println("The computer chose Rock");
            if(number==2)
                System.out.println("The computer chose Paper");
            if(number==3)
                System.out.println("The computer chose Scissor");

            if(ch==1 && number==1)
                System.out.println("Draw");
            else if(ch==1 && number==2)
                System.out.println("Lost");
            else if(ch==1 && number==3){
                System.out.println("Won");
                win++;}
            else if(ch==2 && number==1){
                System.out.println("Won");
                win++;}
            else if(ch==2 && number==2)
                System.out.println("Draw");
            else if(ch==2 && number==3)
                System.out.println("Lost");
            else if(ch==3 && number==1)
                System.out.println("Lost");
            else if(ch==3 && number==2){
                System.out.println("Won");
                win++;}
            else if(ch==3 && number==3)
                System.out.println("Draw");

            i++;

        }
        if(win==3 || win==2)
            System.out.println("You won the game!");
        else
            System.out.println("Aww you lost the game.");
    }
}
