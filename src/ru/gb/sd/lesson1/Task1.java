package ru.gb.sd.lesson1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int maxValue = 0;
        int minValue = a;


        if (a > maxValue) {
            maxValue = a;
        }

        if (b > maxValue) {
            maxValue = b;
        } else if (b < minValue) {
            minValue = b;
        }

        if (c > maxValue) {
            maxValue = c;
        } else if (c < minValue) {
            minValue = c;
        }

        System.out.println (maxValue - minValue);
    }
}