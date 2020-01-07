package io.cucumber.examples.spring;

import io.cucumber.java.en.When;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class SimpleMathSteps {

    private final ResultStore resultStore;

    @When("number {int} is added to {int}")
    public void add(int x, int y) {
        log.info("Adding {} to {}", x, y);
        int result = x + y;
        resultStore.setOperationResult(result);
        resultStore.setAccumulativeResult(result + resultStore.getAccumulativeResult());
    }

}
