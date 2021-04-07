package com.lineate.bench.pattern.memento.example;

public class FileWriterCareTaker {
    private Object object;

    public void save (FileWriterUtil fileWriter) {
        this.object = fileWriter.save();
    }

    public void undo(FileWriterUtil fileWriter) {
        fileWriter.undoToLastSave(object);
    }
}
