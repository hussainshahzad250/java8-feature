package com.hussain.java.feature;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class Java8FeatureApplicationTests {

    @Test
    void hello() {
        String name= "Shahzad";
        assertNotNull(name);
    }
}
