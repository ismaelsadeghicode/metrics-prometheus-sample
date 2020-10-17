package com.example.demo2;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {

    @GetMapping
    @Timed(value = "buyer sayhello", histogram=true,percentiles = {0.95, 0.99},extraTags = {"version","1.0"} )
    public String test(){
        return "test";
    }
}
