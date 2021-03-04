package com.lineate.bench.pattern.command.example.command;

import com.lineate.bench.pattern.command.example.receiver.FileSystemReceiver;

public class OpenFileCommand implements Command {
    private FileSystemReceiver fileSystem;

    public OpenFileCommand(FileSystemReceiver fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
        fileSystem.openFile();
    }
}
