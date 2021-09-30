package task.odin.array.arrayaction.impl;

import task.odin.array.arrayaction.ArraySort;
import task.odin.array.entity.CustomNumber;

public class ArraySortImpl implements ArraySort {

    @Override
    public int[] insertionSort(CustomNumber arr) {
        int [] tempArr = arr.getArr();
        for (int i = 1; i < tempArr.length; i++) {
            int current = tempArr[i];
            int j = i - 1;
            while(j >= 0 && current < tempArr[j]) {
                tempArr[j+1] = tempArr[j];
                j--;
            }
            tempArr[j+1] = current;
        }
        return tempArr;
    }

    @Override
    public int[] bubbleSort(CustomNumber arr) {
        int [] tempArr = arr.getArr();
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < tempArr.length - 1; i++) {
                if (tempArr[i] > tempArr[i+1]) {
                    temp = tempArr[i];
                    tempArr[i] = tempArr[i+1];
                    tempArr[i+1] = temp;
                    sorted = false;
                }
            }
        }
        return tempArr;
    }

    @Override
    public int[] selectionSort(CustomNumber arr) {
        int [] tempArr = arr.getArr();
        for (int i = 0; i < tempArr.length; i++) {
            int min = tempArr[i];
            int minId = i;
            for (int j = i+1; j < tempArr.length; j++) {
                if (tempArr[j] < min) {
                    min = tempArr[j];
                    minId = j;
                }
            }
            int temp = tempArr[i];
            tempArr[i] = min;
            tempArr[minId] = temp;
        }
        return tempArr;
    }
}
