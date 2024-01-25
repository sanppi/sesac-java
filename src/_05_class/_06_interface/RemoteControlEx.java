package _05_class._06_interface;

public class RemoteControlEx {
    public static void main(String[] args) {
        // interface 도 하나의 타입이므로 변수의 타입으로 사용 가능
        // - interface 는 참조 타입 (기본 타입 X) -> null 대입이 가능
        RemoteControl rc; // RemoteControl 타입을 갖는 변수. null 갖고 있음.

        // rc 변수에 Television 객체를 대입
        rc = new Television(); // RemoteControl rc = new Television(); 한 것과 동일
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        // rc 변수에 Audio 객체를 대입 (교체)
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(15);
        rc.turnOff();

    }
}
