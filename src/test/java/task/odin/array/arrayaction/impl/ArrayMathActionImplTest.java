package task.odin.array.arrayaction.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import task.odin.array.entity.CustomNumber;
import task.odin.array.exeption.CustomException;
import task.odin.array.service.CustomFileService;

public class ArrayMathActionImplTest {

    private final ArrayMathActionImpl factory = new ArrayMathActionImpl();
    private final CustomNumber cs = new CustomNumber();
    private final ArrayMathActionImpl action = new ArrayMathActionImpl();
    private static final Logger logger = LogManager.getLogger();


    @BeforeEach
    @DisplayName("serviceTestMethod")
    public void serviceTestMethod() throws CustomException {
        CustomFileService cfs = new CustomFileService();
        String filepath = "resources/file/task1.txt";
        cfs.setIntArrayIntoEntity(cs, filepath);
        logger.info("serviceTestMethod is success");
    }

    @Test
    @DisplayName("arrayElementsSum")
    public void sum() {
        Assertions.assertEquals(factory.sum(cs),296);
    }

    @Test
    @DisplayName("arrayElementsDifference")
    public void difference() {
        Assertions.assertEquals(factory.difference(cs),292);
    }

    @Test
    @DisplayName("arrayElementsMultiplication")
    public void multiplication(){
        Assertions.assertEquals(factory.multiplication(cs),41160);
    }

    @Test
    @DisplayName("arrayElementsDivide")
    public void divide(){
        Assertions.assertEquals(factory.divide(cs),2.0,0.01);
    }

    @Test
    @DisplayName("arrayMedian")
    public void medianArray(){
        Assertions.assertEquals(action.medianArray(cs),59.2,0.1);
    }

    @Test
    @DisplayName("arrayNegativeElements")
    public void negativeArrElements(){
        Assertions.assertEquals(action.negativeArrElements(cs),2);
    }

    @Test
    @DisplayName("arrayPositiveElements")
    public void positiveArrElements(){
        Assertions.assertEquals(action.positiveArrElements(cs),3);
    }
}