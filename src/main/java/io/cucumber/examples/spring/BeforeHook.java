package io.cucumber.examples.spring;

import org.springframework.boot.test.context.SpringBootTest;

import io.cucumber.java.Before;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class BeforeHook {

    @Before
    public void before() {
        log.info("Executing hook {}", this.getClass());
    }

}
