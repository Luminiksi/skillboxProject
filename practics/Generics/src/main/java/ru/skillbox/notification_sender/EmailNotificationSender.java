package ru.skillbox.notification_sender;

import ru.skillbox.StringConstant;
import ru.skillbox.notification.EmailNotification;

import java.util.List;

public class EmailNotificationSender implements NotificationSender<EmailNotification> {
    @Override
    public void send(EmailNotification notification) {
        StringBuilder msg = new StringBuilder();
        msg.append(StringConstant.EMAIL + StringConstant.NEW_LINE);
        msg.append(StringConstant.SUBJECT + ": " + notification.getSubject() + StringConstant.NEW_LINE);
        msg.append(StringConstant.RECEIVERS + ": " + notification.getReceivers() + StringConstant.NEW_LINE);
        msg.append(StringConstant.MESSAGE + ": " + notification.formattedMessage());
        System.out.println(msg);
    }

    @Override
    public void send(List notifications) {
        notifications.forEach(notification -> {
            send((EmailNotification) notification);
            System.out.println();
        });
    }
}
