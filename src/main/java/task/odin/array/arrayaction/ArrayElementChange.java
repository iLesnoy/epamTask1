package task.odin.array.arrayaction;

import task.odin.array.entity.CustomNumber;

public class ArrayElementChange {

    public int[] arrElementChange(CustomNumber arr,int index,int value){
        int[] temp = arr.getArr();

        for (int i = 0; i < temp.length; i++) {
            temp[index] = value;
        }

        return temp;
    }
}
