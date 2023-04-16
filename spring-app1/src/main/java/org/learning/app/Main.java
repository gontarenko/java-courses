package org.learning.app;

import org.learning.app.music.Music;
import org.learning.app.music.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        var testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.value());

        Music music = context.getBean("music", Music.class);
        MusicPlayer player = new MusicPlayer(music);
        player.playMusic();

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        context.close();
    }
}
