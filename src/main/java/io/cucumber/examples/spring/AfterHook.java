package io.cucumber.examples.spring;

import io.cucumber.java.After;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class AfterHook {

    private final ResultStore resultStore;

    @After
    public void after() {
        log.info("Executing hook {}", this.getClass());
        log.info("Accumulative result = {}", resultStore.getAccumulativeResult());
    }

}
