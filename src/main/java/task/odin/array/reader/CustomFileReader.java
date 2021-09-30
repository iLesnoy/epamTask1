package task.odin.array.reader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import task.odin.array.exeption.CustomException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static task.odin.array.validation.CustomArrayValidator.fileValidator;

public class CustomFileReader {

    private static final Logger logger = LogManager.getLogger();

    public static String readAllFile(String filepath) throws CustomException{
        BufferedReader bf = null;
        String line;
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        try {
            bf = new BufferedReader(new FileReader(filepath));
            while ((line = bf.readLine()) != null) {
                if (fileValidator(line)) {
                    list.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            throw new CustomException("File is not found",e);
        } catch (IOException ex) {
            throw new CustomException("File is empty",ex);
        }

        for (String s : list) {
            sb.append(s);
        }

        String fullString = sb.toString();
        return fullString;
    }
}
