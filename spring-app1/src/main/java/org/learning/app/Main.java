package org.learning.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        var testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.value());
        context.close();
    }
}
