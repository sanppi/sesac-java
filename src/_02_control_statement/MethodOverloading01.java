package _02_control_statement;

public class MethodOverloading01 {
    public static void main(String[] args) {

        MethodOverloading01 ol = new MethodOverloading01();
        System.out.println("원: " + ol.calc(5));
        System.out.println("직사각형: " + ol.calc(4.0,7.0));
        System.out.println("삼각형: " + ol.calc(6,3));
    }

    // 원의 넓이
    public double calc(double a) {
        return 3.14 * a * a;
    }

    // 직사각형의 넓이
    public double calc(double a, double b) {
        return a * b;
    }

    // 삼각형의 넓이
    public int calc(int a, int b) {
        return (a*b)/2;
    }
}
