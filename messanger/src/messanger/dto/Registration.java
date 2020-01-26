package messanger.dto;

import java.util.LinkedHashMap;
import java.util.Map;

public class Registration {
    private final Map<String, User> users = new LinkedHashMap<>(  );

    public User registration(String name, String pass){
        if(users.containsKey( name )){
            throw new IllegalArgumentException( "Пользователь с таким именем уже существует" );
        }
        return null;
    }

}
