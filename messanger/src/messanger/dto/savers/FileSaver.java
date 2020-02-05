
package messanger.dto.savers;


import messanger.dto.chat.AChat;
import messanger.dto.message.api.IMessage;
import messanger.dto.savers.api.ISaverChat;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.List;

public class FileSaver implements ISaverChat {
    private FileOutputStream stream;

    public FileSaver() throws FileNotFoundException {
        this("default_name.txt");
    }

    public FileSaver(String fileName) throws FileNotFoundException {
        this(new FileOutputStream(fileName));
    }

    public FileSaver(FileOutputStream stream) {
        this.stream = stream;
    }

    @Override
    public void saveChat(AChat chat) {
        List<? extends IMessage> messages = chat.getMessages();
        try (PrintWriter writer = new PrintWriter(stream)) {
            for (IMessage message : messages) {
                writer.println(message);
            }
        }
    }
}

