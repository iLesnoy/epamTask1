package task.odin.array.arrayaction;

import org.junit.Test;
import task.odin.array.entity.CustomNumber;
import task.odin.array.exeption.CustomException;
import task.odin.array.service.CustomFileService;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayElementChangeImplTest {

    @Test
    public void arrElementChange() throws CustomException{
        ArrayElementChange change = new ArrayElementChange();
        CustomNumber cs = new CustomNumber();
        CustomFileService cfs = new CustomFileService();
        int index = 0;
        int value = -999;
        String filepath = "C:\\Users\\Lenovo\\IdeaProjects\\epamTask1\\.idea\\file\\task1.txt";
        cfs.setIntArrayIntoEntity(cs, filepath);

        int [] expectResultArr = {-999,2,4,5,-6,7,22,-4};
        assertEquals(Arrays.toString(change.arrElementChange(cs,index,value)),
                Arrays.toString(expectResultArr));
    }
}