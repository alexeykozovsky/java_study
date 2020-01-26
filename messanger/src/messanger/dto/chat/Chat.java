package messanger.dto.chat;

import messanger.dto.User;
import messanger.dto.message.Message;

import java.util.*;

public class Chat {
    private List<Message> messages = new ArrayList<>(  );
    private Set<User> users = new HashSet<>(  );

    public void addMessage (Message message){
        Message[] messages = new Message[1];
        messages[0] = message;
        this.addMessage(message);
    }
}
