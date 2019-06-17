package com.bugsnag.mazerunnerplainspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @RequestMapping("/send-unhandled-exception")
    public void sendUnhandledException() {
        throw new RuntimeException("Unhandled exception from TestRestController");
    }

}
