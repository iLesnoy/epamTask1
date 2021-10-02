package task.odin.array.arrayaction;

import task.odin.array.entity.CustomNumber;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


import static java.util.stream.Collectors.toList;

public class ArrayElementChange {

    public Object[] arrElementChange(CustomNumber arr, int index, String value) {
        List<Integer> list = Arrays.stream(arr.getArr()).boxed().collect(toList());
        List<String> strings = list.stream().map(Object::toString)
                .collect(Collectors.toList());
        List<String> changedArr = strings.stream()
                .map(v-> v.replace(strings.get(index),value))
                .collect(toList());
        return changedArr.toArray();
    }
}
