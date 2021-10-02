package task.odin.array.arrayaction.impl;

import task.odin.array.arrayaction.MinMaxElement;
import task.odin.array.entity.CustomNumber;

import java.util.Arrays;

public class MinMaxElementImpl implements MinMaxElement {

    @Override
    public int minElemntSerch(CustomNumber arr){

        return Arrays.stream(arr.getArr()).min().getAsInt();
    }

    @Override
    public int maxElemntSerch(CustomNumber arr){

        return Arrays.stream(arr.getArr()).max().getAsInt();
    }
}
