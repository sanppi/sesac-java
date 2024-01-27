package _05_class._08_generic.Practice;

public class Calculator <T extends Number>{
    private T num1;
    private T num2;

    public Calculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static void main(String[] args) {
        // Integer
        Calculator<Integer> add1 = new Calculator<>(1, 2);
        System.out.println("Integer Sum: " + add1.add());

        // Double
        Calculator<Double> add2 = new Calculator<>(3.21, 2.2);
        System.out.println("Double Sum: " + add2.add());

    }
}
