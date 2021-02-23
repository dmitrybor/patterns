package com.lineate.bench.pattern.adapter.exercise;

public class AdapterPatternDemo {

    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();
        AdvancedMediaPlayer vlcPlayer = new VlcPlayer();
        MediaPlayer vlcPlayerAdapter = new AdvancedMediaPlayerAdapter(vlcPlayer);
        AdvancedMediaPlayer mp4Player = new Mp4Player();
        MediaPlayer mp4PlayerAdapter = new AdvancedMediaPlayerAdapter(mp4Player);

        audioPlayer.play("mp3", "WakeUpInTheMorning.mp3");
        vlcPlayerAdapter.play("vlc", "ListenToYourHeart.mp3");
        mp4PlayerAdapter.play("mp4", "TheNewDay.mp4");
        audioPlayer.play("avi", "GetItDone.avi");
    }
}
