package task.odin.array.reader;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import task.odin.array.exeption.CustomException;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.junit.Assert.*;

public class CustomFileReaderTest {

    public static Logger logger = LogManager.getLogger(CustomFileReaderTest.class);

    @Test
    public void isArrFileEmpty(){
        try{
            String checkString = CustomFileReader.readAllFile("resources/file/task1.txt");
            assertFalse(checkString.isEmpty());

        }catch (CustomException e){
            logger.error(e.getMessage());
        }
    }

    @Test
    @DisplayName("readAllFile")
    public void readAllFile()  {
        try {
            String checkString = CustomFileReader.readAllFile("resources/file/task1.txt");
            String compareString = "294 0 -5 -2 7";
            assertEquals(checkString, compareString);

        } catch (CustomException e) {
            logger.error(e.getMessage());
        }
    }
}