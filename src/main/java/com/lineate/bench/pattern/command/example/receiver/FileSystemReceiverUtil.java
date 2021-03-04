package com.lineate.bench.pattern.command.example.receiver;

public class FileSystemReceiverUtil {
    public static FileSystemReceiver getUnderlyingFileSystem() {
        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is: " + osName);
        if (osName.toLowerCase().contains("windows")) {
            return new WindowsFileSystemReceiver();
        } else {
            return new UnixFileSystemReceiver();
        }
    }
}
