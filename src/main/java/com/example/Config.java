package com.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private Properties properties = new Properties();

    public Config() {
        try {
            properties.load(new FileInputStream("src/main/resources/config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public long getLinkLifetime() {
        return Long.parseLong(properties.getProperty("link.lifetime", "86400000")); // По умолчанию 1 день
    }

    public int getDefaultLimit() {
        return Integer.parseInt(properties.getProperty("default.limit", "5")); // По умолчанию 5 переходов
    }
}
