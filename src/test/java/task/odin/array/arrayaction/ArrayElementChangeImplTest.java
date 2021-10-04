package task.odin.array.arrayaction;

import org.apache.log4j.Level;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import task.odin.array.entity.CustomNumber;
import task.odin.array.exeption.CustomException;
import task.odin.array.reader.CustomFileReaderTest;
import task.odin.array.service.CustomFileService;

import java.util.Arrays;
import java.util.logging.Logger;


public class ArrayElementChangeImplTest {
    public static java.util.logging.Logger logger = Logger.getLogger(String.valueOf(CustomFileReaderTest.class));

    @Test
    @DisplayName("arrayElementChange")
    public void arrElementChange() throws CustomException{
        ArrayElementChange change = new ArrayElementChange();
        CustomNumber cs = new CustomNumber();
        CustomFileService cfs = new CustomFileService();
        String filepath = "resources/file/task1.txt";
        int index = 0;
        String value = "-999";
        cfs.setIntArrayIntoEntity(cs, filepath);
        int [] expectResultArr = {-999, 2, -5, -2, 7};
        Assertions.assertEquals(Arrays.toString(change.arrElementChange(cs,index,value)),
                Arrays.toString(expectResultArr));
    }
}