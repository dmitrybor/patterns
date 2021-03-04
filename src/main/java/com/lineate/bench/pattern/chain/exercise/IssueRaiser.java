package com.lineate.bench.pattern.chain.exercise;

public class IssueRaiser {
    private ErrorHandler handlerChain;

    public IssueRaiser() {
        ErrorHandler emailErrorHandler = new EmailErrorHandler();
        ErrorHandler faxErrorHandler = new FaxErrorHandler(emailErrorHandler);
        this.handlerChain = faxErrorHandler;
    }

    public void raiseMessage(ErrorMessage message) {
        handlerChain.processErrorMessage(message);
    }
}
