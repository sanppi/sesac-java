package _05_class._05_abstract;

public class ShapeEx {
    public static void main(String[] args) {
        // Shape 객체는 new 연산자로 직접 생성할 수 없지만
        // 자식 클래스인 Circle, Square 에서는 new 연산자로 객체 생성이 가능

        Circle circle = new Circle("blue");
        Square square = new Square("yellow");

        circle.start();
        circle.draw();
        System.out.println("원 색상은 : " + circle.getColor());

        square.start();
        square.draw();
        System.out.println("사각형 색상은 : " + square.getColor());

    }
}
