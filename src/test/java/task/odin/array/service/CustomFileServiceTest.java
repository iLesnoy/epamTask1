package task.odin.array.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import task.odin.array.exeption.CustomException;


public class CustomFileServiceTest {

    @Test
    @DisplayName("getIntArrayFromFile")
    public void getIntArrayFromFile() throws CustomException {
        String filepath = "main/resources/file/task1.txt";
        CustomFileService cfs = new CustomFileService();
        int[] checkArray = cfs.getIntArrayFromFile(filepath);
        int[] actualArray = {294,2,-5,-2,7};
        for (int i = 0; i < checkArray.length; i++) {
            Assertions.assertEquals(checkArray[i], actualArray[i]);
        }
    }
}