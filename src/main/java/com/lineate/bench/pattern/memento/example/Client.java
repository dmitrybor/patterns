package com.lineate.bench.pattern.memento.example;

public class Client {
    public static void main(String[] args) {
        FileWriterCareTaker careTaker = new FileWriterCareTaker();

        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
        fileWriter.write("First Set of Data: \nMyra\nLucy\n");
        System.out.println(fileWriter);
        careTaker.save(fileWriter);
        fileWriter.write("Second Set of Data: \nJason\n");
        System.out.println(fileWriter);
        careTaker.undo(fileWriter);
        System.out.println(fileWriter);
    }
}
