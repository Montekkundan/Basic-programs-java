package com.company;
import java.util.Scanner;
class Benford_law {

    public static void main(String[] args) {
        double count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0, count8 = 0, count9 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of digits..");
        int n = scanner.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + " number...");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            int fn = array[i];
            while (fn >= 10) {
                fn = fn / 10;

                if (fn == 1) {
                    count1++;
                } else if (fn == 2) {
                    count2++;
                } else if (fn == 3) {
                    count3++;
                } else if (fn == 4) {
                    count4++;
                } else if (fn == 5) {
                    count5++;
                } else if (fn == 6) {
                    count6++;
                } else if (fn == 7) {
                    count7++;
                } else if (fn == 8) {
                    count8++;
                } else if (fn == 9) {
                    count9++;
                }
            }
        }
            System.out.println("Number of 1's :" + count1);
            System.out.println("Number of 2's :" + count2);
            System.out.println("Number of 3's :" + count3);
            System.out.println("Number of 4's :" + count4);
            System.out.println("Number of 5's :" + count5);
            System.out.println("Number of 6's :" + count6);
            System.out.println("Number of 7's :" + count7);
            System.out.println("Number of 8's :" + count8);
            System.out.println("Number of 9's :" + count9 +"\n");

            System.out.println("Percentage of 1 :"+(count1/ n)*100+"%");
            System.out.println("Percentage of 2 :"+(count2/ n)*100+"%");
            System.out.println("Percentage of 3 :"+(count3/ n)*100+"%");
            System.out.println("Percentage of 4 :"+(count4/ n)*100+"%");
            System.out.println("Percentage of 5 :"+(count5/ n)*100+"%");
            System.out.println("Percentage of 6 :"+(count6/ n)*100+"%");
            System.out.println("Percentage of 7 :"+(count7/ n)*100+"%");
            System.out.println("Percentage of 8 :"+(count8/ n)*100+"%");
            System.out.println("Percentage of 9 :"+(count9/ n)*100+"%");
    }
}



