package com.lineate.bench.pattern.chain.exercise;

import static java.util.Objects.nonNull;

public class EmailErrorHandler implements ErrorHandler {
    private final String key = "email";

    private ErrorHandler nextHandler;

    public EmailErrorHandler() {
    }

    public EmailErrorHandler(ErrorHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void processErrorMessage(ErrorMessage errorMessage) {
        if (errorMessage.getMessage().toLowerCase().contains(key)) {
            System.out.println(String.join(" ",
                    "EmailErrorHandler processed",
                    errorMessage.getPriority().toString(),
                    "priority issue:",
                    errorMessage.getMessage()));
        } else if (nonNull(nextHandler)) {
            nextHandler.processErrorMessage(errorMessage);
        }
    }
}
