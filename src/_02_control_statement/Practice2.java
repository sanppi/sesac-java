package _02_control_statement;

import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 두 개를 입력하세요 >> ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        num(num1, num2); // num 메소드 호출하는 부분
    }

        public static void num(double x, double y) {
            System.out.println("덧셈 결과: " + (x + y));
            System.out.println("뺄셈 결과: " + (x - y));
            System.out.println("나눗셈 결과: " + (x / y));
            System.out.println("곱셈 결과: " + (x * y));
        }
    }

