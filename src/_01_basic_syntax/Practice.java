package _01_basic_syntax;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.println("이름을 입력하세요");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("나이를 입력하세요");
        int age = scanner.nextInt();

        System.out.println("안녕하세요! " + name + "님 ("+ age + "세)");
        // System.out.printf("안녕하세요! %s 님, %d세 이시네요!", name, age);
        // 이렇게 해도 됨.

        scanner.close();
    }
}
