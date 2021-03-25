/*
  Example: ^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\S+$).{8,}$
        ^                 # start-of-string
        (?=.*[0-9])       # a digit must occur at least once
        (?=.*[a-z])       # a lower case letter must occur at least once
        (?=.*[A-Z])       # an upper case letter must occur at least once
        (?=.*[@#$%^&+=])  # a special character must occur at least once
        (?=\S+$)          # no whitespace allowed in the entire string
        .{8,}             # anything,at least eight places though
        $                 # end-of-string*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordSimple extends Password{
    //String PASSWORD_PATTERN_SIMPLE = "^(?=.*[0-9])(?=.*[a-z]).{4,}$";

    public PasswordSimple() {
        super("\"^(?=.*[0-9])(?=.*[a-z]).{4,}$\"");
    }

}
