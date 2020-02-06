package messanger.dto;

import java.io.*;
import java.util.Map;

public class UserLoader {
    public void saveUser(Registration registration)  {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("UserLoader.txt"));) {
            oos.writeObject(registration.getUsers());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadUser(Registration registration) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("UserLoader.txt"))) {
            registration.setUsers((Map<String, User>) ois.readObject());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
