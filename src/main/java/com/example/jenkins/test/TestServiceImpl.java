package com.example.jenkins.test;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String welcome(String name) {
        return "welcome, " + name;
    }
}
