package task.odin.array.arrayaction;

import task.odin.array.entity.CustomNumber;
import task.odin.array.exeption.CustomException;

public interface ArrayMathAction {

    long sum(CustomNumber arr);

    int difference(CustomNumber arr);

    int multiplication(CustomNumber arr);

    double divide(CustomNumber arr) throws CustomException;

    int medianArray(CustomNumber arr);

    int negativeArrElements(CustomNumber arr);

    int positiveArrElements(CustomNumber arr);
}
