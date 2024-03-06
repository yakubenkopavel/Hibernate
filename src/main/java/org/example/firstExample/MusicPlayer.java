package org.example.firstExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class MusicPlayer {
    private Music music;
    private int value;

    public MusicPlayer(){

    }


    public MusicPlayer(Music music){
        this.music = music;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void playMusic(){
        System.out.println(music.getSong());
    }
}
