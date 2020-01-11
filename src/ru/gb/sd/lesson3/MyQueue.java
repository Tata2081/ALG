package ru.gb.sd.lesson3;

import java.util.EmptyStackException;

public class MyQueue<AbsType> {
    private AbsType[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;


    public MyQueue(){
        list = (AbsType[]) new Object[DEFAULT_CAPACITY];
    }

    public void insert(AbsType element){
        if (isFull()) { reCapacity(); }
        list[size] = element;
        size++;
    }

    public AbsType remove(){
        AbsType temp = peek();
        for (int i=0; i<size-1; i++) {
            list[i] = list[i+1];
        }
        list[size-1] = null;
        size--;
        return temp;
    }

    public AbsType peek(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }

       return list[0];
    }


    public int getSize(){
        return size;
    }

    private boolean isFull(){
        return (size == list.length);
    }

    private boolean isEmpty(){
        return size == 0;
    }

    private void  reCapacity(){
        AbsType[] templist = (AbsType[]) new Object[list.length + DEFAULT_CAPACITY];
        System.arraycopy(list, 0, templist, 0, size);
        list = templist;
    }

}
