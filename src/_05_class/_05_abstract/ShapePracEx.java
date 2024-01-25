package _05_class._05_abstract;

public class ShapePracEx {
    public static void main(String[] args) {
        CirclePrac circle = new CirclePrac("Red", 3);
        RectanglePrac rec = new RectanglePrac("Blue", 4, 6);

        System.out.println("* " + circle.getType() + " 도형의 정보 *");
        System.out.println("도형의 색상: " + circle.getColor());
        System.out.println("도형의 넓이: " + circle.calculateArea());

        System.out.println("===========================");
        System.out.println("* " + rec.getType() + " 도형의 정보 *");
        System.out.println("도형의 색상: " + rec.getColor());
        System.out.println("도형의 넓이: " + rec.calculateArea());

    }
}
