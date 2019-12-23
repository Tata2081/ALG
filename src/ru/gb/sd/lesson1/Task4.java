package ru.gb.sd.lesson1;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        ArrayList<Integer> threeMarks = new ArrayList();
        ArrayList<Integer> fourMarks = new ArrayList();

        Integer[] marks = new Integer[a];
        for (int i=0; i< marks.length; i++) {
            marks[i] = scan.nextInt();
            while (marks[i]<1 || marks[i]>31) {
                System.out.println("Не верно введена дата " + marks[i]);
                marks[i] = scan.nextInt();
            }
            if (marks[i] % 2 == 0) {
                fourMarks.add(marks[i]);
            } else {
                threeMarks.add(marks[i]);
            }
        }

        for (int i=0; i< threeMarks.size(); i++) {
            if (i == threeMarks.size()-1) {
                System.out.println(threeMarks.get(i));
            } else {
                System.out.print(threeMarks.get(i) + " ");
            }
        }

        for (int i=0; i< fourMarks.size(); i++) {
            if (i == fourMarks.size()-1) {
                System.out.println(fourMarks.get(i));
            } else {
                System.out.print(fourMarks.get(i) + " ");
            }
        }

        if (threeMarks.size() > fourMarks.size()) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}