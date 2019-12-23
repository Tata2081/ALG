package ru.gb.sd.lesson1;

import java.util.Scanner;

public class Task2 {

    private static final int minValue = 94;
    private static final int maxValue = 727;

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (correctWiegth(a) || correctWiegth(b) || correctWiegth(c)) {
            System.out.println("Error");
        } else if ((a >= b) && (a >= c)) {
            System.out.println(a);
        } else if ((b >= c) && (b >= a)) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

    }

    private static boolean correctWiegth(int i) {
        return ((i < minValue) || (i > maxValue));
    }
}