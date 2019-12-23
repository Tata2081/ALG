package ru.gb.sd.lesson2;

public class Main {
    public static void main(String[] args) {
        ArrayClass list = new ArrayClass();

        list.addRandomList(10);

        list.printArray();

        list.add(5, 20);
        list.printArray();

        list.remove(6);
        list.printArray();

        if (list.removeFirst(8)) {
            list.printArray();
        } else {
            System.out.println("Нет элемента на удажение");
        }

        list.removeAll(1);
        list.printArray();

        if (list.findElement(9)) {
            System.out.println("Элемент найден");
        } else {
            System.out.println("Элемент НЕ найден");
        }


        int arrayLength = 100000;

        timeSort(0, arrayLength);
        timeSort(1, arrayLength);
        timeSort(2, arrayLength);
    }


    private static void timeSort(int typesort, int arrayLength){
        long beginTime;
        Long endTime;
        String resultStr = "";
        ArrayClass list = new ArrayClass();

        list.addRandomList(arrayLength);
        //list.fillRandomList(arrayLength);
        list.printArray();
        beginTime = System.nanoTime();
        switch (typesort) {
            case 0:
                list.selectionSort();
                resultStr = "Время выполнения сортировки выборкой: ";
                break;
            case 1:
                list.insertionSort();
                resultStr = "Время выполнения сортировки вставками: ";
                break;
            case 2:
                list.bubbleSort();
                resultStr = "Время выполнения пузырьковой сортировки: ";
                break;
        }
        endTime = System.nanoTime();
        list.printArray();
        long dif = (endTime - beginTime) / 1000000000;
        System.out.println(resultStr + dif);
    }
}