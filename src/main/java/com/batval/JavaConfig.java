package com.batval;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class JavaConfig {
    @Bean
    public MessageProvider provider() {
        return new InternetMessageProvider();
    }

    @Bean
    public MessageRenderer renderer(@Autowired MessageProvider provider){
        return new SimpleMessageRenderer(provider);
    }

}
