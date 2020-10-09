package effective.java.item6.impl;

import java.util.regex.Pattern;

public class ItemSixUnnecessaryObjects {

    // Performance can be greatly improved!
    public static boolean isRomanNumeralBad(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    //Good
    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD]|D?C{0,3})"
                    + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    public static boolean isRomanNumeralGood(String s) {
        return ROMAN.matcher(s).matches();
    }
}
