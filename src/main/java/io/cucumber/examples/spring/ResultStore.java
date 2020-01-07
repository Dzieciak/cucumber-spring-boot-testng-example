package io.cucumber.examples.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Getter
@Setter
@Scope(SCOPE_CUCUMBER_GLUE)
@Component
public class ResultStore {

    private int operationResult;
    private int accumulativeResult;

}
