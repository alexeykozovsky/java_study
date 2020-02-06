package messanger.dto.savers;

import messanger.dto.chat.AChat;
import messanger.dto.message.api.IMessage;
import messanger.dto.savers.api.ISaverChat;

import java.io.*;
import java.util.List;

public class BinSaver implements ISaverChat, Serializable {
    @Override
    public void saveChat(AChat chat) {
        try(FileOutputStream stream = new FileOutputStream("binchat.txt");
            ObjectOutputStream objectStream = new ObjectOutputStream(stream)) {
            List<IMessage> messages = chat.getMessages();
            for(IMessage message : messages)
            {
                objectStream.writeObject(message.getData());
            }
        } catch(FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
