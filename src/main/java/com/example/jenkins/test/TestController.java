package com.example.jenkins.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/{name}")
    public String welcome(@PathVariable String name) {
        return testService.welcome(name);
    }
}
