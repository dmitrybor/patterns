package com.lineate.bench.pattern.adapter.example.exercise;

public class AdvancedMediaPlayerAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        advancedMediaPlayer.loadFileName(audioType, fileName);
        advancedMediaPlayer.listen();
    }
}
