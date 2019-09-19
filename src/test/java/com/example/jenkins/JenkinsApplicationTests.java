package com.example.jenkins;

import com.example.jenkins.test.TestController;
import com.example.jenkins.test.TestService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JenkinsApplicationTests {

    @Autowired
    private TestService testService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testWelcome() {
        String name = "bob";
        String result = testService.welcome(name);
        Assert.assertEquals("welcome, " + name, result);
    }
}
