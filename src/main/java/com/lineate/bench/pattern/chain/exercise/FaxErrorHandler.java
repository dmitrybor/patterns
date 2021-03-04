package com.lineate.bench.pattern.chain.exercise;

import static java.util.Objects.nonNull;

public class FaxErrorHandler implements ErrorHandler {
    private final String key = "fax";

    private ErrorHandler nextHandler;

    public FaxErrorHandler() {
    }

    public FaxErrorHandler(ErrorHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void processErrorMessage(ErrorMessage errorMessage) {
        if (errorMessage.getMessage().toLowerCase().contains(key)) {
            System.out.println(String.join(" ",
                    "FaxErrorHandler processed",
                    errorMessage.getPriority().toString(),
                    "priority issue:",
                    errorMessage.getMessage()));
        } else if (nonNull(nextHandler)) {
            nextHandler.processErrorMessage(errorMessage);
        }
    }
}
