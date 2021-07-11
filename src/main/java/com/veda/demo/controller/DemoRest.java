package com.veda.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/demo")
public class DemoRest {

    @Operation(summary = "Welcome Demo")
    @GetMapping(path = "/")
    public String getDemo() {
        return "welcome";
    }
}
