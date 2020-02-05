package messanger.dto.savers;

import messanger.dto.chat.AChat;
import messanger.dto.message.api.IMessage;
import messanger.dto.savers.api.ISaverChat;

import java.util.List;

public class ConsoleSaver implements ISaverChat {
    @Override
    public void saveChat(AChat chat) {
        List<? extends IMessage> messages = chat.getMessages();
        for (IMessage message : messages) {
            System.out.println(message);
        }
    }
}
