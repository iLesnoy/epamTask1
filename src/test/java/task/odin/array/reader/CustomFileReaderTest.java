package task.odin.array.reader;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import task.odin.array.exeption.CustomException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

public class CustomFileReaderTest {

    private static final Logger logger = LogManager.getLogger();

    @Test
    public void readAllFile() throws CustomException {
        String checkString = CustomFileReader.readAllFile("main/resources/file/task1.txt");
        String compareString = "33 2 4 5 -6 7 22 -4";
        assertEquals(checkString, compareString);
        logger.log(Level.INFO,"file read successfully");
    }

}