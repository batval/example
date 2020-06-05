package com.batval;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class MessageFactory {

    private static MessageProvider provider;
    private static MessageRenderer renderer;

    public static MessageProvider getProvider() {
        return provider;
    }

    public static MessageRenderer getRenderer() {
        return renderer;
    }

    static {
        Properties properties = new Properties();
        try (InputStream in = MessageFactory.class.getClassLoader().getResourceAsStream("app.properties")){

            properties.load(in);
            String messageProviderClass = properties.getProperty("messageProviderClass");
            String messageRendererClass = properties.getProperty("messageRendererClass");

            provider = (MessageProvider) Class.forName(messageProviderClass).getDeclaredConstructor().newInstance();
            renderer = (MessageRenderer) Class.forName(messageRendererClass).getConstructor(MessageProvider.class).newInstance(provider);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
