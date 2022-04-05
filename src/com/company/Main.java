package com.company;

import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd.MM.yyyy");

        TimeCount hey = new TimeCount();
        System.out.println(hey.start());
        System.out.println(hey.end().format(formatter));

    }
}
