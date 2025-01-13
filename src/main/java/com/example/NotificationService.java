package com.example;
import java.util.UUID;

public class NotificationService {
    public void notifyUser (UUID userId, String message) {
        // Здесь можно реализовать логику уведомлений (через email или консоль)
        System.out.println("Уведомление для пользователя " + userId + ": " + message);
    }
}
