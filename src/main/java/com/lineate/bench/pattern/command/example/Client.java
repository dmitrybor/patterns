package com.lineate.bench.pattern.command.example;

import com.lineate.bench.pattern.command.example.command.CloseFileCommand;
import com.lineate.bench.pattern.command.example.command.Command;
import com.lineate.bench.pattern.command.example.command.OpenFileCommand;
import com.lineate.bench.pattern.command.example.command.WriteFileCommand;
import com.lineate.bench.pattern.command.example.receiver.FileSystemReceiver;
import com.lineate.bench.pattern.command.example.receiver.FileSystemReceiverUtil;

public class Client {

    public static void main(String[] args) {
        FileSystemReceiver receiver = FileSystemReceiverUtil.getUnderlyingFileSystem();
        Command openFileCommand = new OpenFileCommand(receiver);
        FileInvoker invoker = new FileInvoker(openFileCommand);
        invoker.execute();
        Command writeFileCommand = new WriteFileCommand(receiver);
        invoker = new FileInvoker(writeFileCommand);
        invoker.execute();
        Command closeFileCommand = new CloseFileCommand(receiver);
        invoker = new FileInvoker(closeFileCommand);
        invoker.execute();
    }
}
