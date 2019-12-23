package ru.gb.sd.lesson1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        int b = (a - 5) / 10;
        b = b * (b + 1);
        String str;
        if (b == 0) {
            str = "25";
        } else {
            str = b + "25";
        }
        System.out.println(str);
    }
}