package com.lineate.bench.pattern.chain.exercise;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        IssueRaiser issueRaiser = new IssueRaiser();

        ErrorMessage message1 = new ErrorMessage("Fax is reaching late to the destination", MessagePriority.NORMAL);
        ErrorMessage message2 = new ErrorMessage("Email is not going", MessagePriority.HIGH);
        ErrorMessage message3 = new ErrorMessage("In Email BCC field is disabled occasionally", MessagePriority.NORMAL);
        ErrorMessage message4 = new ErrorMessage("Fax is not reaching destination", MessagePriority.HIGH);

        List.of(message1, message2, message3, message4).forEach(issueRaiser::raiseMessage);

    }
}
