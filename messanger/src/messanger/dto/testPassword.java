package messanger.dto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testPassword {
    public static void main(String[] args) {
        String name = "q!qq111";
        Pattern pattern = Pattern.compile( "((?=.*\\d)(?=.*[:/!?+%])(?=.*[a-z])(?=.*[A-Z]).{7,})" );
        Matcher matcher = pattern.matcher( name );
        if (matcher.find()) {
            System.out.println("Пароль подходит");
        } else {
            System.out.println("Имя не подходит");
        }

    }
}
