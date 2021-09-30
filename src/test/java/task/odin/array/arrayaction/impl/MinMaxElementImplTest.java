package task.odin.array.arrayaction.impl;

import org.junit.Test;
import task.odin.array.arrayaction.impl.ArrayMathActionImpl;
import task.odin.array.arrayaction.impl.MinMaxElementImpl;
import task.odin.array.entity.CustomNumber;
import task.odin.array.exeption.CustomException;
import task.odin.array.service.CustomFileService;

import java.io.IOException;

import static org.junit.Assert.*;

public class MinMaxElementImplTest {

    private final CustomNumber cs = new CustomNumber();


    public void serviceTestMethod() throws CustomException{
        CustomFileService cfs = new CustomFileService();
        String filepath = "C:\\Users\\Lenovo\\IdeaProjects\\epamTask1\\.idea\\file\\task1.txt";
        cfs.setIntArrayIntoEntity(cs, filepath);
    }

    @Test
    public void minElemntSerch() throws CustomException{
        serviceTestMethod();
        MinMaxElementImpl element = new MinMaxElementImpl();
        int compareMinResult = -23;
        assertEquals(element.minElemntSerch(cs),compareMinResult);
    }

    @Test
    public void maxElemntSerch() throws CustomException {
        serviceTestMethod();
        MinMaxElementImpl element = new MinMaxElementImpl();
        int compareMaxResult = 34;
        assertEquals(element.maxElemntSerch(cs),compareMaxResult);
    }
}