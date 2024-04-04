package Thuchanh.Thuchanh1;

import java.util.EnumMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Thuchanh1 {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String Email_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public Thuchanh1() {
        pattern=Pattern.compile(Email_REGEX);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
