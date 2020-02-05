package messanger.dto;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class Registration {
    private final Map<String, User> users = new LinkedHashMap<>(  );

    public User registration(String name, String password) throws ValidationExc {
        if(!users.containsKey(name))
        {
            Validation v = new Validation();
            if(v.validation(name, password))
            {
                Random random = new Random();
                int userId = random.nextInt();
                User user = new User(userId, name, password);
                users.put(name, user);
                return user;
            } else
            {
                throw new ValidationExc("Не прошли валидацию");
            }
        } else {
            throw new ValidationExc("Пользователь с таким именем уже есть");
        }
    }

}
