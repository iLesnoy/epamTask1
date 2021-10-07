package task.odin.array.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.*;
import task.odin.array.exeption.CustomException;


public class CustomFileServiceTest {

    private static final Logger logger = LogManager.getLogger();

    @Test
    @DisplayName("getIntArrayFromFile")
    public void getIntArrayFromFile() {
        try {
            String filepath = "resources/file/task1.txt";
            CustomFileService cfs = new CustomFileService();
            int[] expectedArray = cfs.getIntArrayFromFile(filepath);
            int[] actualArr = {294, 2, -5, 2, 7};
            for (int i = 0; i < expectedArray.length; i++) {
                Assertions.assertEquals(expectedArray[i], actualArr[i]);
            }
        }catch (CustomException e){
            logger.error(e.getMessage());
        }
    }
}