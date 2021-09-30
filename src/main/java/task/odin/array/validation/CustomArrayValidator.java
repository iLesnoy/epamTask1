package task.odin.array.validation;

import java.util.regex.Pattern;

public class CustomArrayValidator {
    private static final String regex_isnumber ="^[-?[\\d]+\\s]+$";


    public static boolean fileValidator(String str){
        var pattern = Pattern.compile(regex_isnumber);
        var mather = pattern.matcher(str);
        return mather.matches();
    }
}
