package task.odin.array.validation;

import org.junit.jupiter.api.*;
import task.odin.array.exception.CustomException;
import task.odin.array.reader.CustomFileReader;
import java.util.regex.Pattern;

class CustomArrayValidatorTest {

    static String checkString;
    private static final String regex_isnumber ="^[-?\\d+\\s]+$";

    @BeforeAll
    public static void fileString() throws CustomException {
        checkString = CustomFileReader.readAllFile("resources/file/task1.txt");
    }

    @Test
    @DisplayName("CustomArrValidation")
    void fileValidator() {
        var pattern = Pattern.compile(regex_isnumber);
        var mather = pattern.matcher(checkString);
        Assertions.assertTrue(mather.matches());
    }
}