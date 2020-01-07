package io.cucumber.examples.spring;

import org.assertj.core.api.Assertions;

import io.cucumber.java.en.Then;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class ResultCheckSteps {

    private final ResultStore resultStore;
    private final ResultSquareStore resultSquareStore;

    @Then("operation result is {int}")
    public void checkResult(int expectedResult) {
        int actualResult = resultStore.getOperationResult();
        log.info("Accumulative result is: {}", resultStore.getAccumulativeResult());
        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Then("operation result square is {int}")
    public void checkResultSquare(int expectedResultSquare) {
        int resultSquare = resultSquareStore.getSquareOfResult();
        log.info("Result square = {}", resultSquare);
        Assertions.assertThat(resultSquare).isEqualTo(expectedResultSquare);
    }

    @Then("accumulative result is {int}")
    public void accumulativeResultIs(int expectedResult) {
        int accResult = resultStore.getAccumulativeResult();
        log.info("Accumulative result = {}", accResult);
        Assertions.assertThat(accResult).isEqualTo(expectedResult);
    }

}
