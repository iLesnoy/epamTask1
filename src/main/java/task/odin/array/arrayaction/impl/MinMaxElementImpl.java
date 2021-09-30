package task.odin.array.arrayaction.impl;

import task.odin.array.arrayaction.MinMaxElement;
import task.odin.array.entity.CustomNumber;

import java.util.Arrays;

public class MinMaxElementImpl implements MinMaxElement {

    @Override
    public int minElemntSerch(CustomNumber arr){
        int[] temp = arr.getArr();
        int min = Arrays.stream(temp).min().getAsInt();
        return min;
    }

    @Override
    public int maxElemntSerch(CustomNumber arr){
        int[] temp = arr.getArr();
        int max = Arrays.stream(temp).max().getAsInt();
        return max;
    }
}
