package com.lineate.bench.pattern.adapter.exercise;

public class Mp4Player implements AdvancedMediaPlayer {
    private String audioType;
    private String fileName;

    @Override
    public void loadFileName(String audioType, String fileName) {
        this.audioType = audioType;
        this.fileName = fileName;
    }

    @Override
    public void listen() {
        if ("mp3".equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType)) {
            System.out.println("Playing audio type: " + audioType + " file name: " + fileName);
        } else {
            System.out.println("Audio format: " + audioType + " not supported");
        }
    }
}
