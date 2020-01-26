package messanger.dto.message;

import messanger.dto.User;
import messanger.dto.message.api.MessageType;

import java.util.Date;

public class Message<T> {
    private User user;
    private MessageType type;
    private T data;
    private Date date;


    public Message(User user, MessageType type, T data, Date date) {
        this.user = user;
        this.type = type;
        this.data = data;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Message{" +
                "user=" + user +
                ", type=" + type +
                ", data=" + data +
                ", date=" + date +
                '}';
    }
}
