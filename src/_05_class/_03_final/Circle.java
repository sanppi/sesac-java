package _05_class._03_final;

import java.util.Scanner;

// radius 와 calculateArea()는 각 객체의 상태에 의존하므로 인스턴스 멤버로 정의되었고,
// PI는 클래스에 속하는 값이므로 정적(static) 멤버로 선언되었습니다.

public class Circle {
    public final double radius;

    public static final double PI = 3.141592;

    // 생성자
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return radius * radius * PI;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("원의 반지름을 입력하세요: ");
        double radius = sc.nextDouble();

        // Circle 객체 생성, 사용자가 입력한 radius 넣어주기
        Circle circle = new Circle(radius);

        System.out.println("원의 반지름: " + circle.radius);
        System.out.println("원의 넓이: " + circle.calculateArea());

        sc.close();
    }
}
