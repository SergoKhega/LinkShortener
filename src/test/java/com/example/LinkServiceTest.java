package com.example;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkServiceTest {
    @Test
    public void testShortenLink() {
        LinkService linkService = new LinkService();
        UUID userId = UUID.randomUUID();
        String originalUrl = "http://example.com";
        String shortUrl = linkService.shortenLink(userId, originalUrl, 5);

        assertEquals("short.ly/0", shortUrl);
    }

    @Test
    public void testRedirect() {
        LinkService linkService = new LinkService();
        UUID userId = UUID.randomUUID();
        String originalUrl = "http://example.com";
        String shortUrl = linkService.shortenLink(userId, originalUrl, 5);

        String redirectedUrl = linkService.redirect(shortUrl);
        assertEquals(originalUrl, redirectedUrl);
    }
}
