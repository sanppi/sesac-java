package _05_class._06_interface.Practice;

import _05_class._06_interface.Audio;
import _05_class._06_interface.Television;

public class MusicEx {
    public static void main(String[] args) {

        System.out.println("==== MP3 ====");
        Mp3Player mp3 = new Mp3Player("아이유 블루밍");
        mp3.play();
        mp3.stop();

        System.out.println("==== CD ====");
        CdPlayer cd = new CdPlayer("아이유 꽃갈피");
        cd.play();
        cd.stop();
    }
}
