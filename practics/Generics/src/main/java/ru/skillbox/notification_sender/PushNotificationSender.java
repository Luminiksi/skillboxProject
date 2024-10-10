package ru.skillbox.notification_sender;

import ru.skillbox.StringConstant;
import ru.skillbox.notification.PushNotification;

import java.util.List;

public class PushNotificationSender implements NotificationSender<PushNotification> {

    @Override
    public void send(PushNotification notification) {
        StringBuilder msg = new StringBuilder();
        msg.append(StringConstant.PUSH + StringConstant.NEW_LINE);
        msg.append(StringConstant.TITLE + ": " + notification.getTitle() + StringConstant.NEW_LINE);
        msg.append(StringConstant.RECEIVER + ": " + notification.getReceiver() + StringConstant.NEW_LINE);
        msg.append(StringConstant.MESSAGE + ": " + notification.formattedMessage());
        System.out.println(msg);
    }

    @Override
    public void send(List<PushNotification> notifications) {
        notifications.forEach(notification -> {
            send(notification);
            System.out.println();
        });
    }
}
