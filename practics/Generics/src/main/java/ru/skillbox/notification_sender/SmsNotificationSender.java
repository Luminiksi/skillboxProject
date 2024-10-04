package ru.skillbox.notification_sender;

import ru.skillbox.StringConstant;
import ru.skillbox.notification.SmsNotification;

import java.util.List;

public class SmsNotificationSender implements NotificationSender<SmsNotification> {
    @Override
    public void send(SmsNotification notification) {
        StringBuilder msg = new StringBuilder();
        msg.append(StringConstant.SMS + StringConstant.NEW_LINE);
        msg.append(StringConstant.RECEIVERS + ": " + notification.getReceivers() + StringConstant.NEW_LINE);
        msg.append(StringConstant.MESSAGE + ": " + notification.formattedMessage());
        System.out.println(msg);
    }

    @Override
    public void send(List notifications) {
        notifications.forEach(notification -> {
            send((SmsNotification) notification);
            System.out.println();
        });
    }
}
