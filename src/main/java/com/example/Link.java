package com.example;

import java.util.UUID;

public class Link {
    private String originalUrl;
    private String shortUrl;
    private int visitLimit;
    private long expiryTime;
    private int visitCount;
    private UUID userId;

    public Link(String originalUrl, String shortUrl, int visitLimit, long expiryTime, UUID userId) {
        this.originalUrl = originalUrl;
        this.shortUrl = shortUrl;
        this.visitLimit = visitLimit;
        this.expiryTime = expiryTime;
        this.visitCount = 0;
        this.userId = userId;
    }

    // Геттеры
    public String getOriginalUrl() {
        return originalUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public int getVisitLimit() {
        return visitLimit;
    }

    public long getExpiryTime() {
        return expiryTime;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public UUID getUserId() {
        return userId;
    }

    public void incrementVisitCount() {
        this.visitCount++;
    }
}
