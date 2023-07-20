package com.example.jenkinsdemo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class JenkinsDemoApplicationTests {
    public static Logger logger = LoggerFactory.getLogger(JenkinsDemoApplication.class);
    @Test
    void contextLoads() {
        logger.info("Test Case Executing");
        logger.info("Test Case Executing Again");
        assertEquals(true,true);
    }

}
