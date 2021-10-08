package task.odin.array.reader;

import task.odin.array.exception.CustomException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import static task.odin.array.validation.CustomArrayValidator.fileValidator;

public class CustomFileReader {

    public static Logger logger = LogManager.getLogger(CustomFileReader.class);


    public static String readAllFile(String filepath) throws CustomException {
        String line;
        List<String> list = new ArrayList<>();
        StringBuilder finalStr = new StringBuilder();
        try {
            BufferedReader  bf = new BufferedReader(new FileReader(filepath));
            while ((line = bf.readLine()) != null) {
                if (fileValidator(line)) {
                    list.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            logger.error(e.getMessage());
            throw new CustomException("File is not found",e);
        } catch (IOException ex) {
            logger.error(ex.getMessage());
            throw new CustomException(ex.getMessage());
        }

        for (String str : list) {
            finalStr.append(str);
        }

        return finalStr.toString();
    }
}
