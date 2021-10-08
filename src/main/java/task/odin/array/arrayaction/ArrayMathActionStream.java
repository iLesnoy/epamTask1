package task.odin.array.arrayaction;

import task.odin.array.entity.CustomNumber;
import task.odin.array.exception.CustomException;

public interface ArrayMathActionStream {

    long streamSum(CustomNumber arr);
    
    int streamDifference(CustomNumber arr);
    
    int streamMultiplication(CustomNumber arr);
    
    double streamDivide(CustomNumber arr) throws CustomException;
    
    double streamMedianArray(CustomNumber arr);
    
    int streamNegativeArrElements(CustomNumber arr);
    
    int streamPositiveArrElements(CustomNumber arr);

    Object [] streamArrayElementChange (CustomNumber arr, int index, String value) throws CustomException;

    public int streamMinElementSearch(CustomNumber arr);

    public int streamMaxElementSearch(CustomNumber arr);
}
