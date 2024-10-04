package ru.skillbox.notification;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Setter
@AllArgsConstructor
public class SmsNotification implements Notification {
    @Getter
    private String message;
    private List<String> receivers;

    @Override
    public String formattedMessage() {
        return message;
    }

    public String getReceivers() {
        StringBuilder msg = new StringBuilder();
        this.receivers.forEach(item -> msg.append(item).append(", "));
        return msg.delete(msg.length() - 2, msg.length()).toString();
    }
}
