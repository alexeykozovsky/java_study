package messanger;

import messanger.dto.*;
import messanger.dto.chat.TextChat;
import messanger.dto.message.TextMessage;
import messanger.dto.message.api.IMessage;
import messanger.dto.message.api.MessageType;
import messanger.dto.savers.BinSaver;
import messanger.dto.savers.ConsoleSaver;
import messanger.dto.savers.FileSaver;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class MessangerMain {

    public static void main(String[] args) throws ValidationExc {
        Registration registration = new Registration();
        User user1 = registration.registration("akoz413@gmail.com", "!Qq123456");
        User user2 = registration.registration("Vika88@gmail.com", "Qq?111111");

        TextMessage message1 = new TextMessage(user1, new Date(), "Привет!");
        TextMessage message2 = new TextMessage(user2, new Date(), "Приветики!");

        Set<User> users = new HashSet<>();
        users.add(user1);
        users.add(user2);

        List<IMessage> messages = new ArrayList<>();
        messages.add(message1);
        messages.add(message2);

        TextChat textChat = new TextChat(users, messages);

        try {
            textChat.saveChat( new BinSaver() );
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            textChat.saveChat(new ConsoleSaver());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            textChat.saveChat(new FileSaver(new FileOutputStream("file_name.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        UserLoader userLoader = new UserLoader();
        userLoader.saveUser( registration );
        userLoader.loadUser( registration );

    }


}
