package task.odin.array.arrayaction.impl;

import org.junit.jupiter.api.*;
import task.odin.array.entity.CustomNumber;
import task.odin.array.exeption.CustomException;
import task.odin.array.service.CustomFileService;


public class MinMaxElementImplTest {

    private final CustomNumber cs = new CustomNumber();

    @BeforeEach
    public void serviceTestMethod() throws CustomException {
        CustomFileService cfs = new CustomFileService();
        String filepath = "resources/file/task1.txt";
        cfs.setIntArrayIntoEntity(cs, filepath);
    }

    @Test
    @DisplayName("arrayMinElemSerch")
    public void minElemntSerch(){
        MinMaxElementImpl element = new MinMaxElementImpl();
        int expectedMinResult = -5;
        Assertions.assertEquals(element.minElemntSerch(cs), expectedMinResult);
    }

    @Test
    @DisplayName("arrayMaxElemSerch")
    public void maxElemntSerch(){
        MinMaxElementImpl element = new MinMaxElementImpl();
        int expectedMaxResult = 294;
        Assertions.assertEquals(element.maxElemntSerch(cs), expectedMaxResult);
    }
}