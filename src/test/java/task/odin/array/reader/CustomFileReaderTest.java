package task.odin.array.reader;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task.odin.array.exeption.CustomException;


public class CustomFileReaderTest {

    private static final Logger logger = LogManager.getLogger();

    @Test
    public void readAllFile() throws CustomException {
        String checkString = CustomFileReader.readAllFile("main/resources/file/task1.txt");
        String compareString = "33 2 4 5 -6 7 22 -4";
        Assertions.assertEquals(checkString, compareString);
        logger.log(Level.INFO,"file read successfully");
    }

}