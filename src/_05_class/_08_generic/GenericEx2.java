package _05_class._08_generic;

// 참고. Number 클래스
// Java 의 모든 숫자 형식의 부모 클래스

// 제네릭 제한
// Number 를 상속한 클래스만 허용 (하게끔 extends 로 제한 걸어준 것)
class Box<T extends Number> {
    private T item;
    public void setItem(T item) {
        this.item = item;
    }
}

// 인터페이스로도 예시
interface Movable{
    void move();
}

class Car implements Movable {
    @Override
    public void move(){
        System.out.println("자동차 출발 !");
    }
}

// Movable 만 가능하게끔 제한 걸기
class Container<T extends Movable> {
    private T item;
    public Container(T item) {
        this.item = item;
    }
    public void makeItMove() {
        item.move();
    }
}

public class GenericEx2 {
    public static void main(String[] args) {
     // Box<String> stringBox = new Box(String); // Number 아니라고 오류
     Box<Double> doubleBox = new Box<>();

     // case 2
        Container<Car> carContainer = new Container<>(new Car()); // T 타입이 car 라 Car 의 객체를 넣어준 것
    }
}
