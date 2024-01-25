package _05_class._05_abstract;

public abstract class ShapePrac {
    String color;
    String type;

    // 생성자
    public ShapePrac(String color, String type) {
        this.color = color;
        this.type = type;
    }

    // 추상 메소드
    abstract double calculateArea();

    // getter
    String getColor() {
        return color;
    }
    String getType() {
        return type;
    }
}
