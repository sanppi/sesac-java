package _05_class._01_class;

import java.util.Scanner;

public class Practice1 {
    public int width;
    public int height;

    // 생성자
    public Practice1(int width, int height) {
        // 지역변수랑 필드 변수명이 동일하기 때문에 this 를 사용해서 필드값에 접근
        this.width = width;
        this.height = height;
    }

    // 메소드
    public int area() {
        return width * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");

        int width = sc.nextInt();
        int height = sc.nextInt();

        // 입력받은 값으로 Practice1 객체(rectangle)를 생성하고 생성자 호출
        Practice1 rectangle = new Practice1(width, height);

        // Practice1 객체인 rectangle 안의 area 메소드를 호출해 실행시킴
        System.out.println(rectangle.area());

        sc.close();
    }
}
