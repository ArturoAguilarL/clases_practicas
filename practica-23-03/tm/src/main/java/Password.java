import java.util.regex.*;

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
public class Password {

    protected String pass;
    protected String regex;
    //Patron de pass
    private static final String PASSWORD_PATTERN =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";

    //Pattern pertence a regex - Defines a pattern (to be used in a search)
    private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

    public Password(String regex) {
        this.regex = regex;
    }

    public boolean isValid(final String password) {
        //Used to search for the pattern
        Matcher matcher = pattern.matches(password);
        return matcher.matches();
    }

    public void setPassword(final String password) throws Exception {
        if(!isValid(password)){
            throw new Exception("Password Incorrecta");
        }
        this.pass = password;
    }
}
