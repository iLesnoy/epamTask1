package task.odin.array.arrayaction.impl;

import org.junit.Test;
import task.odin.array.entity.CustomNumber;
import task.odin.array.exeption.CustomException;
import task.odin.array.service.CustomFileService;


import static org.junit.Assert.assertEquals;

public class ArraySortImplTest {

    private final CustomNumber cs = new CustomNumber();
    private ArraySortImpl sort = new ArraySortImpl();
    private int [] expectedArr = {-6,-4,2,4,5,7,22,33};

    public void serviceTestMethod() throws CustomException{
        CustomFileService cfs = new CustomFileService();
        String filepath = "C:\\Users\\Lenovo\\IdeaProjects\\epamTask1\\.idea\\file\\task1.txt";
        cfs.setIntArrayIntoEntity(cs, filepath);
    }

    @Test
    public void insertionSort() throws CustomException{
        serviceTestMethod();
        int [] temp = sort.insertionSort(cs);
        for (int i = 0; i < expectedArr.length; i++) {
            assertEquals(expectedArr[i],temp[i]);
        }
    }

    @Test
    public void bubbleSort() throws CustomException{
        serviceTestMethod();
        int [] temp = sort.bubbleSort(cs);
        for (int i = 0; i < expectedArr.length; i++) {
            assertEquals(expectedArr[i],temp[i]);
        }
    }

    @Test
    public void selectionSort() throws CustomException{
        serviceTestMethod();
        int [] temp = sort.selectionSort(cs);
        for (int i = 0; i < expectedArr.length; i++) {
            assertEquals(expectedArr[i],temp[i]);
        }
    }
}