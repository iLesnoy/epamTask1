package task.odin.array.arrayaction.impl;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import task.odin.array.entity.CustomNumber;
import task.odin.array.exeption.CustomException;
import task.odin.array.service.CustomFileService;

import java.util.Arrays;

public class ArrayMathActionStreamImplTest {

    private final CustomNumber cs = new CustomNumber();
    private final ArrayMathActionStreamImpl action = new ArrayMathActionStreamImpl();
    private static final Logger logger = LogManager.getLogger();


    @BeforeEach
    @DisplayName("serviceTestMethod")
    public void serviceTestMethod() throws CustomException {
        CustomFileService cfs = new CustomFileService();
        String filepath = "resources/file/task1.txt";
        cfs.setIntArrayIntoEntity(cs, filepath);
    }

    @Test
    @DisplayName("arrayElementsSum")
    public void streamSum() {
        Assertions.assertEquals(action.streamSum(cs),294);
    }

    @Test
    @DisplayName("arrayElementsDifference")
    public void streamDifference() {
        Assertions.assertEquals(action.streamDifference(cs),294);
    }

    @Test
    @DisplayName("arrayElementsMultiplication")
    public void streamMultiplication(){
        Assertions.assertEquals(action.streamMultiplication(cs),41160);
    }

    @Test
    @DisplayName("arrayElementsDivide")
    public void streamDivide() {
        try {
            Assertions.assertEquals(action.streamDivide(cs),2.0,0.01);
        } catch (CustomException e) {
            logger.log(Level.ERROR,e.getMessage());
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("arrayMedian")
    public void streamMedianArray(){
        Assertions.assertEquals(action.streamMedianArray(cs),58.8,0.1);
    }

    @Test
    @DisplayName("arrayNegativeElements")
    public void streamNegativeArrElements(){
        Assertions.assertEquals(action.streamNegativeArrElements(cs),2);
    }

    @Test
    @DisplayName("arrayPositiveElements")
    public void streamPositiveArrElements(){
        Assertions.assertEquals(action.streamPositiveArrElements(cs),3);
    }

    @Test
    @DisplayName("arrayElementChange")
    public void streamArrElementChange(){
        try {
            int index = 0;
            String value = "-999";
            int[] expectResultArr = {-999, 0, -5, -2, 7};
            Assertions.assertEquals(Arrays.toString(action.streamArrayElementChange(cs, index, value)),
                    Arrays.toString(expectResultArr));
        }catch (CustomException e){
            logger.error(e.getMessage());
        }
    }

    @Test
    @DisplayName("arrayMinElemSerch")
    public void minElementSearch(){
        int expectedMinResult = -5;
        Assertions.assertEquals(action.streamMinElementSearch(cs), expectedMinResult);
    }

    @Test
    @DisplayName("arrayMaxElemSerch")
    public void maxElemntSearch(){
        int expectedMaxResult = 294;
        Assertions.assertEquals(action.streamMaxElementSearch(cs), expectedMaxResult);
    }
}