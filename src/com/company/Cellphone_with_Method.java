package com.company;

class Cellphone{
    public void ring(){
        System.out.println("Ringing......");
    }
    public void vibrate(){
        System.out.println("Vibrating......");
    }
    public void Calling(){
        System.out.println("Calling Person......");
    }
}
public class Cellphone_with_Method {
    public static void main(String[] args) {
        Cellphone one = new Cellphone();
        one.ring();
        one.vibrate();
        one.Calling();
    }
}
