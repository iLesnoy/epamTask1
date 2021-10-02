package task.odin.array.arrayaction.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import task.odin.array.arrayaction.ArrayMathAction;
import task.odin.array.entity.CustomNumber;


import java.util.*;
import java.util.stream.IntStream;

public class ArrayMathActionImpl implements ArrayMathAction {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public long sum(CustomNumber arr) {
        return Arrays.stream(arr.getArr())
                .sum();
    }

    @Override
    public int difference(CustomNumber arr) {
        return  IntStream.of(arr.getArr())
                .reduce((a,b)->a-b).getAsInt();
    }

    @Override
    public int multiplication(CustomNumber arr) {

        return IntStream.of(arr.getArr())
                .reduce(1,(x, y)->x*y);
    }

    @Override
    public double divide(CustomNumber arr){
        return IntStream.of(arr.getArr())
                .reduce(1,(x, y)->x/y);
    }

    @Override
    public double medianArray(CustomNumber arr) {
        return IntStream.of(arr.getArr())
                .summaryStatistics()
                .getAverage();
    }

    @Override
    public int negativeArrElements(CustomNumber arr) {

        return (int) IntStream.of(arr.getArr())
                .filter(p->p<0).count();
    }

    @Override
    public int positiveArrElements(CustomNumber arr) {

        return (int) IntStream.of(arr.getArr())
                .filter(p->p>=0).count();
    }

}
