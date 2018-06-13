package sample;

import java.util.regex.Pattern;

public class Checker {
    private static final Pattern mathRegex = Pattern.compile("^[-]?(([1-9]\\d*|0)(\\.\\d+)?[+\\-/\\*^])+\\d+(\\.\\d+)?$");

    public static boolean check(String input) {
       return mathRegex.asPredicate().test(input);
    }
}
