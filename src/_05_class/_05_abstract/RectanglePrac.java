package _05_class._05_abstract;

public class RectanglePrac extends ShapePrac{
    int width;
    int height;

    public RectanglePrac (String color, int width, int height) {
        super(color, "Rectangle");
        this.width = width;
        this.height = height;
    }

    double calculateArea() {
        return width * height;
    }
}
