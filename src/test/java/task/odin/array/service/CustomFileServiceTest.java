package task.odin.array.service;

import org.junit.jupiter.api.*;
import task.odin.array.exeption.CustomException;


public class CustomFileServiceTest {

    @Test
    @DisplayName("getIntArrayFromFile")
    public void getIntArrayFromFile() throws CustomException {
        String filepath = "resources/file/task1.txt";
        CustomFileService cfs = new CustomFileService();
        int[] expectedArray = cfs.getIntArrayFromFile(filepath);
        int[] actualArr = {294,2,-5,2,7};
        for (int i = 0; i < expectedArray.length; i++) {
            Assertions.assertEquals(expectedArray[i], actualArr[i]);
        }
    }
}