package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class LinkService {
    private Map<UUID, User> users = new HashMap<>();
    private int counter = 0;

    public String shortenLink(UUID userId, String originalUrl, int limit) {
        String shortUrl = "short.ly/" + counter++;
        Link newLink = new Link(originalUrl, shortUrl, limit, System.currentTimeMillis() + 86400000, userId);

        users.computeIfAbsent(userId, k -> new User()).addLink(newLink);
        return shortUrl;
    }

    public String redirect(String shortUrl) {
        for (User  user : users.values()) {
            for (Link link : user.getLinks()) {
                if (link.getShortUrl().equals(shortUrl)) {
                    if (link.getVisitCount() < link.getVisitLimit() && System.currentTimeMillis() < link.getExpiryTime()) {
                        link.incrementVisitCount();
                        return link.getOriginalUrl();
                    } else {
                        return "Ссылка недоступна или истекла.";
                    }
                }
            }
        }
        return "Ссылка не найдена.";
    }
}
