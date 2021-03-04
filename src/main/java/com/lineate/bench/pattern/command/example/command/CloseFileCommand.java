package com.lineate.bench.pattern.command.example.command;

import com.lineate.bench.pattern.command.example.receiver.FileSystemReceiver;

public class CloseFileCommand implements Command {
    private FileSystemReceiver fileSystem;

    public CloseFileCommand(FileSystemReceiver fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
        fileSystem.closeFile();
    }
}
