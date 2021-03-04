package com.lineate.bench.pattern.chain.exercise;

public class ErrorMessage {
    private String message;
    private MessagePriority priority;

    public ErrorMessage(String message, MessagePriority priority) {
        this.message = message;
        this.priority = priority;
    }

    public String getMessage() {
        return message;
    }

    public MessagePriority getPriority() {
        return priority;
    }
}
