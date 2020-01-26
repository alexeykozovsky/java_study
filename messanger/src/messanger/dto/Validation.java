package messanger.dto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public static boolean validateName (String name) throws ValidationExc{
        Pattern pattern = Pattern.compile( "[a-zA-Z0-9]+@[a-zA-Z0-9.]+" );
        Matcher matcher = pattern.matcher( name );
        if(matcher.find()){
        }
        else{
            throw new ValidationExc("Имя не соответствует требованиям");
        }
        return true;
    }

    public static boolean validatePassword (String password) throws ValidationExc{
        Pattern pattern = Pattern.compile( "((?=.*\\d)(?=.*[:/!?+%])(?=.*[a-z])(?=.*[A-Z]).{7,})" );
        Matcher matcher = pattern.matcher( password );
        if(matcher.find()){
        }
        else {
            throw new ValidationExc( "Пароль не соответствует требованиям" );
        }
        return true;
    }


}

