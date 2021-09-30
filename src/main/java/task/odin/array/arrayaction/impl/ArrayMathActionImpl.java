package task.odin.array.arrayaction.impl;

import task.odin.array.arrayaction.ArrayMathAction;
import task.odin.array.entity.CustomNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMathActionImpl implements ArrayMathAction {


    @Override
    public long sum(CustomNumber arr) {
        int[] temp = arr.getArr();
        long sumResult = Arrays.stream(temp).sum();
        return sumResult;
    }

    @Override
    public int difference(CustomNumber arr) {
        int[] temp = arr.getArr();
        int diffResult = temp[0];
        for (int i = 1; i < temp.length; i++) {
            diffResult -=temp[i];
        }
        return diffResult;
    }

    @Override
    public int multiplication(CustomNumber arr) {
        int[] temp = arr.getArr();
        int multiplicatResult= 1;
        for (int i = 0; i < temp.length; i++) {
            multiplicatResult *=temp[i];
        }
        return multiplicatResult;
    }

    @Override
    public double divide(CustomNumber arr) {
        int[] temp = arr.getArr();

        double firstDivideElement= temp[0];
        for (int i = 1; i < temp.length; i++) {
            firstDivideElement /=temp[i];

        }
        return firstDivideElement;
    }

    @Override
    public int medianArray(CustomNumber arr) {
        int[] temp = arr.getArr();
        int sum = 0;
        for(int i : temp) {
            sum += i;
        }

        return sum / arr.getArrLenght();
    }

    @Override
    public int negativeArrElements(CustomNumber arr) {
        int[] temp = arr.getArr();
        List<Integer> negativeNumbers=new ArrayList<>();
        for (int i = 0; i < temp.length; i++) {
            if(temp[i] < 0) {
                negativeNumbers.add(temp[i]);
            }
        }
        return negativeNumbers.size();
    }

    @Override
    public int positiveArrElements(CustomNumber arr) {
        int[] temp = arr.getArr();
        List<Integer> postiveNumbers=new ArrayList<>();
        for (int i = 0; i < temp.length; i++) {
            if(temp[i] >= 0) {
                postiveNumbers.add(temp[i]);
            }
        }
        return postiveNumbers.size();
    }

}
