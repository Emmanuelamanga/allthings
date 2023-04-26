package com.databaseproject.allthings.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/gc")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        // return new Greeting(counter.incrementAndGet(), String.format(template, name));
        System.out.println("dead");
        return "hi";
    }

	public AtomicLong getCounter() {
		return counter;
	}

	public static String getTemplate() {
		return template;
	}
}