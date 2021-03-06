package task.odin.array.arrayaction;

import task.odin.array.entity.CustomNumber;
import task.odin.array.exception.CustomException;

public interface ArrayMathAction {

    long sum(CustomNumber arr);

    int difference(CustomNumber arr);

    int multiplication(CustomNumber arr);

    double divide(CustomNumber arr) throws CustomException;

    double medianArray(CustomNumber arr);

    int negativeArrElements(CustomNumber arr);

    int positiveArrElements(CustomNumber arr);

    int [] elementChange (CustomNumber arr, int index, int value);

    public int minElementSearch(CustomNumber arr);

    public int maxElementSearch(CustomNumber arr);


}
