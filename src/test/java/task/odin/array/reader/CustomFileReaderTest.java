package task.odin.array.reader;

import org.junit.Test;
import task.odin.array.exeption.CustomException;


import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class CustomFileReaderTest {

    public static java.util.logging.Logger logger = Logger.getLogger(String.valueOf(CustomFileReaderTest.class));

    @Test
    public void readAllFile()  {
        try {
            String checkString = CustomFileReader.readAllFile("main/resources/file/task1.txt");
            String compareString = "294 2 -5 -2 7";
            assertEquals(checkString, compareString);
            logger.info("file read successfully");
        } catch (CustomException e) {
            logger.log(Level.INFO,e.getMessage());
        }
    }

}