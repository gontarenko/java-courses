package org.learning.app;

import org.learning.app.music.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer classicMusicPlayer = context.getBean("classicMusicPlayer", MusicPlayer.class);
        System.out.println(classicMusicPlayer.getName() + " with volume = " + classicMusicPlayer.getVolume());
        classicMusicPlayer.playMusic();

        MusicPlayer rockMusicPlayer = context.getBean("rockMusicPlayer", MusicPlayer.class);
        System.out.println(rockMusicPlayer.getName() + " with volume = " + rockMusicPlayer.getVolume());
        rockMusicPlayer.playMusic();

        context.close();
    }
}
