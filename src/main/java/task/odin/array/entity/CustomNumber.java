package task.odin.array.entity;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import task.odin.array.exeption.CustomException;

import java.util.Arrays;

public class CustomNumber {
    private static final Logger logger = LogManager.getLogger();
    private int[] arr;

    public CustomNumber() {
    }

    public CustomNumber(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr.clone();
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getArrLenght(){
        return arr.length;
    }


    public boolean isArrayEmpty(){
        return  this.getArrLenght() == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomNumber that = (CustomNumber) o;
        return Arrays.equals(arr, that.arr);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }

    @Override
    public String toString() {
        var ab =  new StringBuilder().
                append(Arrays.toString(arr));
        return ab.toString();
    }

}
