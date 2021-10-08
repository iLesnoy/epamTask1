package task.odin.array.arrayaction.impl;

import task.odin.array.arrayaction.ArrayMathActionStream;
import task.odin.array.entity.CustomNumber;
import task.odin.array.exception.CustomException;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;


public class ArrayMathActionStreamImpl implements ArrayMathActionStream {


    @Override
    public long streamSum(CustomNumber arr) {
        return IntStream.of(arr.getArr())
                .reduce(0, Integer::sum);
    }

    @Override
    public int streamDifference(CustomNumber arr) {
        return IntStream.of(arr.getArr())
                .reduce((a, b) -> a - b).getAsInt();
    }

    @Override
    public int streamMultiplication(CustomNumber arr) {

        return IntStream.of(arr.getArr())
                .reduce(1, (x, y) -> x * y);
    }

    @Override
    public double streamDivide(CustomNumber arr) throws CustomException {
        return IntStream.of(arr.getArr())
                .reduce((x, y) -> x / y).stream().sum();
    }

    @Override
    public double streamMedianArray(CustomNumber arr) {
        return IntStream.of(arr.getArr())
                .summaryStatistics()
                .getAverage();
    }

    @Override
    public int streamNegativeArrElements(CustomNumber arr) {

        return (int) IntStream.of(arr.getArr())
                .filter(p -> p < 0).count();
    }

    @Override
    public int streamPositiveArrElements(CustomNumber arr) {

        return (int) IntStream.of(arr.getArr())
                .filter(p -> p >= 0).count();
    }

    @Override
    public Object[] streamArrayElementChange(CustomNumber arr, int index, String value) throws CustomException {

        List<Integer> list = Arrays.stream(arr.getArr()).boxed().collect(toList());
        List<String> strings = list.stream().map(Object::toString)
                .collect(Collectors.toList());

        return strings.stream()
                .map(v -> v.replace(strings.get(index), value)).toArray();
    }
    
    @Override
    public int streamMinElementSearch(CustomNumber arr){

        return Arrays.stream(arr.getArr()).min().getAsInt();
    }

    @Override
    public int streamMaxElementSearch(CustomNumber arr){

        return Arrays.stream(arr.getArr()).max().getAsInt();
    }
}

