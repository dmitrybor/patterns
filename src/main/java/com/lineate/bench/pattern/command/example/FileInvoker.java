package com.lineate.bench.pattern.command.example;

import com.lineate.bench.pattern.command.example.command.Command;

public class FileInvoker {
    private Command command;

    public FileInvoker(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}
