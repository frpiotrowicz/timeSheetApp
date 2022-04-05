package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeCount {
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd.MM.yyyy");

    public void clock() {
        while (true) {
            //for later: fix 1 sec delay
            if (now.getSecond() != LocalDateTime.now().getSecond()) {
                System.out.println(now.format(formatter));
                now = LocalDateTime.now();
            }
        }

    }
    public String start() {
        LocalDateTime start = LocalDateTime.now();
        return start.format(formatter);
    }
    public LocalDateTime end() {
        LocalDateTime end = LocalDateTime.now();
        end = end.plusHours(3);
        return end;
    }

}
