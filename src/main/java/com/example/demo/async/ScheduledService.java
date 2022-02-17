package com.example.demo.async;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {
    @Scheduled(cron = "0/2 * * * * ?")
    public void hello() {

//        System.out.println("hello...");
    }
}
