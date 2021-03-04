package com.lineate.bench.pattern.command.example.receiver;

public interface FileSystemReceiver {
    void openFile();

    void writeFile();

    void closeFile();
}
