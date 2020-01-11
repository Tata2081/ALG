package ru.gb.sd.lesson3;

import java.util.EmptyStackException;

public class MyStack<AbsType> {
    private AbsType[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;

    public MyStack(){
        list = (AbsType[]) new Object[DEFAULT_CAPACITY];
    }

    public void push(AbsType element){
        if (isFull()) { reCapacity(); }
        list[size] = element;
        size++;
    }

    public AbsType pop(){
        AbsType temp = peek();
        list[size-1] = null;
        size--;
        return temp;
    }

    public AbsType peek(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return list[size-1];
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
