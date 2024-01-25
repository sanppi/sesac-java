package _05_class._05_abstract;

// 추상 클래스
public abstract class Shape {
    // 필드 선언
    String color;

    // 생성자
    public Shape(String color) {
        this.color = color;
    }

    // 추상 메소드 선언 ( abstract 키워드 사용 )
    // - 선언만 하고 구현은 하지 않음
    // - 중괄호 없음
    // - 구현 내용이 자식 클래스마다 다른 경우 추상 메소드 사용
    // - 오버라이딩이랑 다른 점 : 자식 클래스에서 무조건 구현해야 함!

    abstract void draw();

    // 일반 메소드
    void start() {
        System.out.println("도형을 그려보자.");
    }

    String getColor() {
        return color;
    }
}
