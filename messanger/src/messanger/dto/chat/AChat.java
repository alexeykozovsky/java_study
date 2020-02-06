package messanger.dto.chat;

import messanger.dto.User;
import messanger.dto.chat.api.IChat;
import messanger.dto.message.api.IMessage;
import messanger.dto.savers.api.ISaverChat;

import java.io.IOException;
import java.util.List;
import java.util.Set;

public abstract class AChat implements IChat {
    private final Set<User> users;
    private final List<IMessage> messages;

    public AChat(Set<User> users, List<IMessage> messages)
    {
        this.users = users;
        this.messages = messages;
    }

    @Override
    public Set<User> getUsers() {
        return users;
    }

    @Override
    public List<IMessage> getMessages()
    {
        return messages;
    }

    @Override
    public void addMessage(IMessage message)
    {
        if(users.contains(message.getUser()))
        {
            messages.add(message);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void addMessage(IMessage[] message)
    {
        if(message != null)
        {
            for(IMessage mes : message)
            {
                addMessage(mes);
            }
        }
    }

    @Override
    public void addMessage(List<IMessage> message)
    {
        if(message != null)
        {
            for(IMessage mes : message)
            {
                addMessage(mes);
            }
        }
    }

    @Override
    public void saveChat(ISaverChat saver) throws IOException {
        saver.saveChat(this);
    }
}
