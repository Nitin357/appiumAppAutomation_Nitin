package com.quantela.codenet.qa.qpf_wallet_mob_ui_test.utils;



import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppiumConfig {

    private static AppiumConfig appiumConfig;
    private final Properties properties;

    // Private constructor to enforce the singleton pattern
    private AppiumConfig() {
        properties = new Properties();
        try {
            InputStream inputStream = AppiumConfig.class.getClassLoader().getResourceAsStream("AppiumConfig.properties");
            if (inputStream != null) {
                properties.load(inputStream);
            } else {
                throw new RuntimeException("AppiumConfig.properties not found");
            }
        } catch (IOException e) {
            throw new RuntimeException("Error loading AppiumConfig.properties", e);
        }
    }

    public synchronized static AppiumConfig initConfig() {
        if (appiumConfig == null) {
            appiumConfig = new AppiumConfig();
        }
        return appiumConfig;
    }

    public static AppiumConfig getInstance() {
        if (appiumConfig == null) {
            throw new RuntimeException("Appium config not initialized");
        }
        return appiumConfig;
    }

    public String getValueForKey(String key) {
        return properties.getProperty(key);
    }
}
