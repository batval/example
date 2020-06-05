package com.batval;

import org.springframework.stereotype.Component;


public class SimpleMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello world!";
    }
}
