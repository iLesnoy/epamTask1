package task.odin.array.parser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import task.odin.array.exception.CustomException;
import task.odin.array.reader.CustomFileReader;

import static org.junit.Assert.assertEquals;


class CustomArrayParserTest {

    private static final Logger logger = LogManager.getLogger();

    @Test
    @DisplayName("StringParser")
    public void parse() {
        try {
            String expectedToParseString = CustomFileReader.readAllFile("resources/file/task1.txt");
            int [] expectedArrAfterParse = {294,0,-5,-2,7};
            Assertions.assertArrayEquals(expectedArrAfterParse, CustomArrayParser.parse(expectedToParseString));
        } catch (CustomException e) {
            logger.error(e.getMessage());
        }

    }
}