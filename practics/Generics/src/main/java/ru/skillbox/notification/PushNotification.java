package ru.skillbox.notification;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ru.skillbox.StringConstant;

@Setter
@Getter
@AllArgsConstructor
public class PushNotification implements Notification {
    private String title;
    private String message;
    private String receiver;

    @Override
    public String formattedMessage() {
        return StringConstant.EMOJI + " " + message;
    }
}
