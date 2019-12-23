package ru.gb.sd.lesson1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int sum = 0;

        if (Math.abs(a) > 10000) {
            System.out.println("Указанное число > 10000");
            a = scan.nextInt();
        }

        if (a >= 1) {
            for (int i = 1; i <= a; i++) sum = sum + i;
        } else {
            for (int i = 1; i >= a; i--) sum = sum + i;
        }
        System.out.println(sum);
    }
}