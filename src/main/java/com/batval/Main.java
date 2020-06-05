package com.batval;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main (String[] args){
      //xml config
        //  ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        //java config
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        MessageRenderer renderer = context.getBean("simpleMessageRenderer",MessageRenderer.class);
        renderer.render();
    }
}
