package _05_class._05_abstract;

public class CirclePrac extends ShapePrac{
    double radius;

    public CirclePrac(String color, double radius) {
        // 부모 클래스의 생성자에 필요한 type 정보도 전달해줘야 함
        super(color, "Circle");
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
