package com.frepiso.easyhome.infrastructure.api.ping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @GetMapping("/")
    public String home() {
        return "Hello, home!";
    }

    @GetMapping("/secured")
    public String secured() {
        return "Hello, secured!";
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

}
