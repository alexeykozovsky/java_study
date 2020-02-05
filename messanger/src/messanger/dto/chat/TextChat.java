package messanger.dto.chat;

import messanger.dto.User;
import messanger.dto.chat.api.IChat;
import messanger.dto.message.api.IMessage;

import java.io.Serializable;

import java.util.List;
import java.util.Set;

public class TextChat extends AChat implements IChat, Serializable {

    public TextChat(Set<User> users, List<IMessage> messages)
    {
        super(users, messages);
    }
}

