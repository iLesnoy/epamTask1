package task.odin.array.parser;

public class CustomArrayParser {

    public static int[] parse(String str) {
        String[] numberArr = str.split(" ");
        int[] numbers = new int[numberArr.length];
        for (int i = 0; i < numberArr.length; i++) {
            numbers[i] = Integer.parseInt(numberArr[i]);
        }
        return numbers;
    }
}
