package com.example;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        LinkService linkService = new LinkService();
        Scanner scanner = new Scanner(System.in);
        UUID userId = UUID.randomUUID(); // Для примера создаем пользователя

        while (true) {
            System.out.println("Введите оригинальный URL (или 'exit' для выхода):");
            String originalUrl = scanner.nextLine();
            if (originalUrl.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println("Введите лимит переходов:");
            int limit = Integer.parseInt(scanner.nextLine());

            String shortUrl = linkService.shortenLink(userId, originalUrl, limit);
            System.out.println("Сокращенная ссылка: " + shortUrl);
        }

        scanner.close();
    }
}
