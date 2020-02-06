package messanger.dto.chat.api;

import messanger.dto.User;
import messanger.dto.message.api.IMessage;
import messanger.dto.savers.api.ISaverChat;

import java.io.IOException;
import java.util.List;
import java.util.Set;

public interface IChat {

    Set<User> getUsers();
    List<IMessage> getMessages();
    void addMessage(IMessage message);
    void addMessage(IMessage[] message);
    void addMessage(List<IMessage> message);
    void saveChat(ISaverChat saver) throws IOException;


}
