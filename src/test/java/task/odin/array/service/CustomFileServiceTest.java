package task.odin.array.service;

import org.junit.Test;
import task.odin.array.exeption.CustomException;

import java.io.IOException;

import static org.junit.Assert.*;

public class CustomFileServiceTest {

    @Test
    public void getIntArrayFromFile() throws CustomException {
        String filepath = "main/resources/file/task1.txt";
        CustomFileService cfs = new CustomFileService();
        int[] checkArray = cfs.getIntArrayFromFile(filepath);
        int[] actualArray = {2, 33, 34, -1 ,-23,2};
        for (int i = 0; i < checkArray.length; i++) {
            assertEquals(checkArray[i], actualArray[i]);
        }
    }
}