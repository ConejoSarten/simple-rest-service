package com.conejosarten.simplerestservice.controller;

import com.conejosarten.simplerestservice.dto.SomeResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class RestServiceController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/hello")
    @SuppressWarnings("unused")
    public SomeResource hello(@RequestParam(value = "message",
                                            required = false,
                                            defaultValue = "Hello you!")
                                  String aMessage)
    {
        return new SomeResource(counter.incrementAndGet(),
                                String.format("Here's your message: %s",
                                                aMessage));
    }
}
