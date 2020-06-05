package com.batval;

import org.springframework.stereotype.Component;

@Component
public class InternetMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Message received from Internet";
    }
}
