package _05_class._06_interface.Practice;

public class Mp3Player implements Music{
    private String music;

    public Mp3Player(String music) {
        this.music = music;
    }

    @Override
    public void play() {
        System.out.println("MP3 플레이어에서 '" + music + "' 노래를 재생합니다.");
    }
    @Override
    public void stop() {
        System.out.println("MP3 플레이어에서 '" + music + "' 노래를 정지합니다.");
    }
}