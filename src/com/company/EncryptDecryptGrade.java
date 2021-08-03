package com.company;

public class EncryptDecryptGrade {
    public static void main(String[] args) {
        //Encrypt
        char grade= 'B';
                grade=(char)(grade+8);
        System.out.println(grade);
        //Decrypt
        grade=(char)(grade-8);
        System.out.println(grade);
    }
}
