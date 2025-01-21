package com.abc.Mobile;

import org.springframework.stereotype.Component;

@Component
public class MobileRecharge {
    public long mobileNo;
    public void recharge() {
        System.out.println("Recharge Done!!");
    }
}
