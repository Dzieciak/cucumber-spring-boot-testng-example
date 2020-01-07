package io.cucumber.examples.spring;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ResultSquareStore {

    private final ObjectFactory<ResultStore> resultStoreObjectFactory;

    public int getSquareOfResult() {
        int result = resultStoreObjectFactory.getObject().getOperationResult();
        return result * result;
    }

}
