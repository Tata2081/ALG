package ru.gb.sd.lesson2;

import java.util.Random;

public class ArrayClass {
    private Random r = new Random();
    private int[] list;
    private int size=0;
    private final int DEFAULT_CAPACITY = 1000000;

    public ArrayClass(){
        list = new int[DEFAULT_CAPACITY];
    }

    public void addRandomList(int countItem){
        for (int i=0; i<countItem; i++) {
            this.add(r.nextInt(1000));
        }
    }

    public void fillRandomList(int countItem){
        size = countItem;
        for (int i=0; i<size; i++) {
            list[i] = (int)(Math.random() * 10);
        }
    }

    public void add(int el){
        list[size] = el;
        size ++;
    }

    public int get(int index){
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("недопустимое значение индекса");
        }

        return this.list[index];
    }

    public void set(int index, int el){
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("недопустимое значение индекса");
        }

        this.list[index] = el;
    }


    public void add(int index, int el){
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("недопустимое значение индекса");
        }

        for (int i=size; i < index; i--){
            list[i] = list[i-1];
        }
        list[index] = el;
        size ++;
    }

    public void remove (int index){
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("недопустимое значение индекса");
        }

        for (int i=index; i<size-1; i++) {
            list[i] = list[i+1];
        }
        list[size-1] = 0;
        size--;
    }

    private int indexOf(int el){
        for (int i=0; i<size; i++) {
            if (list[i] == el) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeFirst(int el){
        int index = indexOf(el);
        if (index != -1) {
            remove(index);
            return true;
        }
        return false;
    }

    public void removeAll(int el){
        boolean removeEl = removeFirst(el);
        while (removeEl) {
            removeEl = removeFirst(el);
        }
    }

    public boolean findElement(int el){
        return indexOf(el)>-1;
    }
    public void printArray(){
        String strArray = "";
        if (size !=0) {
            for (int i = 0; i < (size - 1); i++) {
                strArray = strArray + list[i] + ", ";
            }
            strArray = strArray + list[size-1];
            System.out.println(strArray);
        } else {
            System.out.println("Массив пуст");
        }

    }


    private void swap(int index1, int index2) {
        int temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }

    public void selectionSort() {
        for (int i = 0; i < size - 1; i++) {
            int imin = i;
            for (int j = i + 1; j < size; j++) {
                if( list[j]<list[imin]){
                    imin = j;
                }
            }
            swap(i, imin);
        }
    }


    public void insertionSort(){
        int key;
        for (int i = 1; i <size ; i++) {
            int j = i;
            key  = list[i];
            while(j>0 && key<list[j-1]){
                list[j] = list[j-1];
                j--;
            }
            list[j] = key;
        }
    }

    public void bubbleSort(){
        boolean isSwap;
        for (int i = size-1; i > 0 ; i--) {
            isSwap = false;
            for (int j = 0; j < i ; j++) {
                if(list[j+1]<list[j]){
                    swap(j+1, j);
                    isSwap = true;
                }
            }
            if(!isSwap){
                break;
            }
        }
    }

}