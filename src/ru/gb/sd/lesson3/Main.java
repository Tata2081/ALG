package ru.gb.sd.lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        workStack();
        workQueue();
        workPriorityQueue();
        workDek();
        converWords();
    }

    private static void workStack(){
        MyStack<Integer> intArray = new MyStack<>();

        System.out.println("\r\nЗаполнение стека");
        for (int i = 0; i<20; i++){
           int temp =  (int) (Math.random()*10);
           intArray.push(temp);
           System.out.print(temp + " ");
        }

        System.out.println("\r\nИзвлечение данных из стека");
        int size = intArray.getSize();
        for (int i = 0; i<size; i++) {
            System.out.print(intArray.pop() + " ");
        }
    }

    private static void workQueue(){
        MyQueue<Integer> intArray = new MyQueue<>();

        System.out.println("\r\nЗаполнение очереди");
        for (int i = 0; i<20; i++){
            int temp =  (int) (Math.random()*10);
            intArray.insert(temp);
            System.out.print(temp + " ");
        }

        System.out.println("\r\nИзвлечение данных из очереди");
        int size = intArray.getSize();
        for (int i = 0; i<size; i++) {
            System.out.print(intArray.remove() + " ");
        }
    }

    private static void workPriorityQueue(){
        MyPriorityQueue<Integer> intArray = new MyPriorityQueue<>();

        System.out.println("\r\nЗаполнение приоритетной очереди");
        for (int i = 0; i<20; i++){
            int temp =  (int) (Math.random()*10);
            intArray.insert(temp);
            System.out.print(temp + " ");
        }

        System.out.println("\r\nИзвлечение данных из приоритетной очереди");
        int size = intArray.getSize();
        for (int i = 0; i<size; i++) {
            System.out.print(intArray.remove() + " ");
        }
    }

    private static void workDek(){
        MyDek<Integer> intArray = new MyDek<>();


        System.out.println("\r\nЗаполнение Дека 5 и 6 справо 1 и 2 слева");
        intArray.insertRigth(5);
        intArray.insertRigth(6);
        intArray.insertLeft(1);
        intArray.insertLeft(2);

        System.out.println("\r\nИзвлечение данных из Дека слева");
        int size = intArray.getSize();
        for (int i = 0; i<size; i++) {
            System.out.print(intArray.removeLeft() + " ");
        }

        intArray.insertRigth(5);
        intArray.insertRigth(6);
        intArray.insertLeft(1);
        intArray.insertLeft(2);

        System.out.println("\r\nИзвлечение данных из Дека справа");
        size = intArray.getSize();
        for (int i = 0; i<size; i++) {
            System.out.print(intArray.removeRigth() + " ");
        }

    }

    private static void converWords(){
        Scanner scaner = new Scanner(System.in);
        System.out.println("\r\nВведите слово:");
        String words = scaner.nextLine();

        MyStack<Character> lettersArray = new MyStack<>();

        for (int i = 0; i<words.length(); i++){
           lettersArray.push(words.charAt(i));
        }

        System.out.println("\r\nСлово наоборот");
        int size = lettersArray.getSize();
        for (int i = 0; i<size; i++) {
            System.out.print(lettersArray.pop());
        }

    }
}
