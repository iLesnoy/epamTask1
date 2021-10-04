package task.odin.array.reader;

import task.odin.array.exeption.CustomException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


import static task.odin.array.validation.CustomArrayValidator.fileValidator;

public class CustomFileReader {

    public static java.util.logging.Logger logger = Logger.getLogger(String.valueOf(CustomFileReader.class));


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
            logger.log(Level.INFO,e.getMessage());
            throw new CustomException("File is not found",e);
        } catch (IOException ex) {
            logger.log(Level.INFO,ex.getMessage());
            throw new CustomException(ex.getMessage());
        }
        for (String str : list) {
            finalStr.append(str);
        }

        return finalStr.toString();
    }
}
