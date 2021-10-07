package task.odin.array.arrayaction.impl;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import task.odin.array.arrayaction.ArrayMathAction;
import task.odin.array.entity.CustomNumber;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ArrayMathActionImpl implements ArrayMathAction {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public long sum(CustomNumber arr) {
        int[] temp = arr.getArr();

        return Arrays.stream(temp).sum();
    }

    @Override
    public int difference(CustomNumber arr) {
        int[] temp = arr.getArr();
        int diffResult = temp[0];
        for (int i = 1; i < temp.length; i++) {
            diffResult -= temp[i];
        }
        return diffResult;
    }

    @Override
    public int multiplication(CustomNumber arr) {
        int[] temp = arr.getArr();
        int multiplicatResult = 1;
        for (int i = 0; i < temp.length; i++) {
            multiplicatResult *= temp[i];
        }
        return multiplicatResult;
    }

    @Override
    public double divide(CustomNumber arr) {
        int[] temp = arr.getArr();

        double firstDivideElement = temp[0];
        try {
            for (int i = 1; i < temp.length; i++) {
                firstDivideElement /= temp[i];

            }
        } catch (ArithmeticException e) {
            logger.log(Level.ERROR, e.getMessage());
        }
        return firstDivideElement;
    }

    @Override
    public double medianArray(CustomNumber arr) {
        int[] temp = arr.getArr();
        int sum = 0;
        for (int i : temp) {
            sum += i;
        }

        return sum / arr.getArrLenght();
    }

    @Override
    public int negativeArrElements(CustomNumber arr) {
        int[] temp = arr.getArr();
        List<Integer> negativeNumbers = new ArrayList<>();
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] < 0) {
                negativeNumbers.add(temp[i]);
            }
        }
        return negativeNumbers.size();
    }

    @Override
    public int positiveArrElements(CustomNumber arr) {
        int[] temp = arr.getArr();
        List<Integer> postiveNumbers = new ArrayList<>();
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] >= 0) {
                postiveNumbers.add(temp[i]);
            }
        }
        return postiveNumbers.size();
    }

    @Override
    public int[] elementChange(CustomNumber arr, int index, int value) {
        int[] temp = arr.getArr();

        for (int i = 0; i < temp.length; i++) {
            temp[index] = value;
        }

        return temp;
    }

    @Override
    public int minElementSearch(CustomNumber arr) {
        int [] temp = arr.getArr();
        Arrays.sort(temp);
        return temp[0];
    }

    @Override
    public int maxElementSearch(CustomNumber arr) {
        int[] temp = arr.getArr();
        Arrays.sort(temp);
        return temp[temp.length-1];
    }

}

