package _05_class._05_abstract;

// 구체적인 클래스
public class Circle extends Shape {
    public Circle(String color) {
        super(color);
    }

    // 추상 메소드 구현
    void draw() {
        System.out.println("원 그리기!");
    }
}
