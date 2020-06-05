package com.batval;

public class InternetMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Message received from Internet";
    }
}
