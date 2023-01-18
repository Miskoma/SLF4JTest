package com.example.SLF4JTest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@EnableAutoConfiguration
public class LogController {


    @GetMapping("/Trace")
    public String TraceResponse(){
        int x = 25;
        log.trace("Trace log {}", x);
        return "Logging Trace";
    }

    @GetMapping("/Debug")
    public String DebugResponse(){
        int x = 25;
        log.debug("Debug log {}", x);
        return "Logging Debug";
    }

    @GetMapping("/Info")
    public String InfoResponse(){
        int x = 25;
        log.info("Info log {}", x);
        return "Logging Info";
    }

    @GetMapping("/Warn")
    public String WarnResponse(){
        int x = 25;
        log.warn("Warn log {}", x);
        return "Logging Warn";
    }
    @GetMapping("/Error")
    public String ErrorResponse(){
        int x = 25;
        log.error("Error log {}", x);
        return "Logging Error";
    }
}
