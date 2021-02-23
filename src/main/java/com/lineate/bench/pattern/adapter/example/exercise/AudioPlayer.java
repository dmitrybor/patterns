package com.lineate.bench.pattern.adapter.example.exercise;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if ("mp3".equalsIgnoreCase(audioType)) {
            System.out.println("Playing audio type: " + audioType + " file name: " + fileName);
        } else {
            System.out.println("Audio format: " + audioType + " not supported");
        }
    }
}
