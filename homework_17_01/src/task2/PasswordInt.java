package task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordInt extends Password {
    public String ExcPassword (String psw) throws MyExc2 {
        Pattern pattern = Pattern.compile( "(?=.*[a-z])(?=.*[A-Z])" );
        Matcher matcher = pattern.matcher( psw );

        if (matcher.find()) {
            System.out.println("Ваш пароль сохранен!");
        } else {
            throw new MyExc2( "Пароль должен содержать не менее одной маленькой и не менее одной большой буквы латинского алфавита" );
        }
        return psw;
    }
}
