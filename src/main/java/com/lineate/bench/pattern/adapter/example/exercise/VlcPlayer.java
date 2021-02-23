package com.lineate.bench.pattern.adapter.example.exercise;

public class VlcPlayer implements AdvancedMediaPlayer {
    private String audioType;
    private String fileName;

    @Override
    public void loadFileName(String audioType, String fileName) {
        this.audioType = audioType;
        this.fileName = fileName;
    }

    @Override
    public void listen() {
        if ("mp3".equalsIgnoreCase(audioType) || "vlc".equalsIgnoreCase(audioType)) {
            System.out.println("Playing audio type: " + audioType + " file name: " + fileName);
        } else {
            System.out.println("Audio format: " + audioType + " not supported");
        }
    }
}
