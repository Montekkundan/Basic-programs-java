package com.company;
import java.util.Random;
import java.util.Scanner;
class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

     Game(){
        Random play= new Random();
        this.number= play.nextInt(100);
    }
    void takeUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number....");
        inputNumber=scanner.nextInt();
    }
    boolean isCorrectNumber(){
    if(inputNumber==number){
        return true;
    }
    else if(inputNumber<number){
        System.out.println("Too low...");
    }
    else if(inputNumber>number){
        System.out.println("Too high...");
    }
    return false;
    }
}
public class GuessTheNumber {

    public static void main(String[] args) {
        Game g =new Game();
        boolean b=false;
        while(!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
            System.out.println(b);
        }
    }
}
