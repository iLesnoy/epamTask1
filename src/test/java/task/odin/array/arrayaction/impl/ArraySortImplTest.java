package task.odin.array.arrayaction.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import task.odin.array.entity.CustomNumber;
import task.odin.array.exeption.CustomException;
import task.odin.array.service.CustomFileService;


public class ArraySortImplTest {

    private final CustomNumber cs = new CustomNumber();
    private final ArraySortImpl sort = new ArraySortImpl();
    private final int [] expectedArr = {-5,-2,2,7,294};

    @BeforeEach
    public void serviceTestMethod() throws CustomException{
        CustomFileService cfs = new CustomFileService();
        String filepath = "resources/file/task1.txt";
        cfs.setIntArrayIntoEntity(cs, filepath);
    }

    @Test
    @DisplayName("insertionSort")
    public void insertionSort() {
        int [] temp = sort.insertionSort(cs);
        for (int i = 0; i < expectedArr.length; i++) {
            Assertions.assertEquals(expectedArr[i],temp[i]);
        }
    }

    @Test
    @DisplayName("bubbleSort")
    public void bubbleSort() {
        int [] temp = sort.bubbleSort(cs);
        for (int i = 0; i < expectedArr.length; i++) {
            Assertions.assertEquals(expectedArr[i],temp[i]);
        }
    }

    @Test
    @DisplayName("selectionSort")
    public void selectionSort(){
        int [] temp = sort.selectionSort(cs);
        for (int i = 0; i < expectedArr.length; i++) {
            Assertions.assertEquals(expectedArr[i],temp[i]);
        }
    }
}