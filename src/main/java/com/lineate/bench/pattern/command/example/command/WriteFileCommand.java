package com.lineate.bench.pattern.command.example.command;

import com.lineate.bench.pattern.command.example.receiver.FileSystemReceiver;

public class WriteFileCommand implements Command {
    private FileSystemReceiver fileSystem;

    public WriteFileCommand(FileSystemReceiver fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
        fileSystem.writeFile();
    }
}
