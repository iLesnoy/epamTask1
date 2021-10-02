package task.odin.array.service;

import task.odin.array.entity.CustomNumber;
import task.odin.array.exeption.CustomException;
import task.odin.array.parser.CustomArrayParser;
import task.odin.array.reader.CustomFileReader;


public class CustomFileService {
    public int[] getIntArrayFromFile(String filepath) throws CustomException{
        String readString = CustomFileReader.readAllFile(filepath);
        return CustomArrayParser.parse(readString);
    }

    public void setIntArrayIntoEntity(CustomNumber cn, String filepath) throws CustomException{
        cn.setArr(getIntArrayFromFile(filepath));
    }
}
