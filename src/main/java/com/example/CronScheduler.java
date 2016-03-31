package com.example;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by simonhamermesh on 3/7/16.
 */
@Component
public class CronScheduler {

    @Scheduled(cron="*/60 * * * * *")
    public void callControllerFeature(){
        HelloController helloController = new HelloController();
        helloController.getCustomerList();
    }
}
