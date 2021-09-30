package task.odin.array.arrayaction.impl;

import org.junit.Test;
import task.odin.array.arrayaction.impl.ArrayMathActionImpl;
import task.odin.array.entity.CustomNumber;
import task.odin.array.exeption.CustomException;
import task.odin.array.service.CustomFileService;

import java.io.IOException;

import static org.junit.Assert.*;

public class ArrayMathActionImplTest {

    private final ArrayMathActionImpl factory = new ArrayMathActionImpl();
    private final CustomNumber cs = new CustomNumber();
    private ArrayMathActionImpl action = new ArrayMathActionImpl();


    public void serviceTestMethod() throws CustomException {
        CustomFileService cfs = new CustomFileService();
        String filepath = "C:\\Users\\Lenovo\\IdeaProjects\\epamTask1\\.idea\\file\\task1.txt";
        cfs.setIntArrayIntoEntity(cs, filepath);
    }

    @Test
    public void sum() throws CustomException {
        serviceTestMethod();
        int compareResult = 63;
        assertEquals(factory.sum(cs),compareResult);
    }

    @Test
    public void difference() throws CustomException {
        serviceTestMethod();
        int compareResult = 31;
        assertEquals(factory.difference(cs),compareResult);
    }

    @Test
    public void multiplication() throws CustomException{
        serviceTestMethod();
        int compareResult = 66;
        assertEquals(factory.multiplication(cs),compareResult);
    }

    @Test
    public void divide() throws CustomException{
        serviceTestMethod();
        double compareResult = 16.5;
        assertEquals(factory.divide(cs),compareResult,0.01);
    }

    @Test
    public void medianArray() throws CustomException{
        serviceTestMethod();
        int expectedMedian  = 10;
        assertEquals(action.medianArray(cs),expectedMedian);
    }

    @Test
    public void negativeArrElements() throws CustomException{
        serviceTestMethod();
        int expNegativeNumbAmount = 2;
        assertEquals(action.negativeArrElements(cs),expNegativeNumbAmount);
    }

    @Test
    public void positiveArrElements() throws CustomException{
        serviceTestMethod();
        int expPositiveNumbAmount = 6;
        assertEquals(action.positiveArrElements(cs),expPositiveNumbAmount);
    }
}