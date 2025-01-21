package com.abc.mainclass;

import com.abc.Mobile.MobileRecharge;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MobileRecharge mr = context.getBean(MobileRecharge.class);
        mr.recharge();
    }
}
