package org.example.home_work_04.task2.message;

public class NotificationService {
    private MessageService messageService;

    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendNotification(String message, String recipient) {
        messageService.sendMessage(message, recipient);
    }
}
