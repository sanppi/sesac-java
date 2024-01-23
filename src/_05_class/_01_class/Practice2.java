package _05_class._01_class;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Practice2 {
    // 필드
    private int width;
    private int height;

    public Practice2(int width) {
        // 지역변수랑 필드 변수명이 동일하기 때문에 this 를 사용해서 필드값에 접근
        this.width = width;
    }
    // getter, setter 생성
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area() {
        return width * height;
    }

    // 생성자 매개변수에서 height 매개변수 지우고, height 는 setter 로 추후 설정
//    public Practice2(int width, int height) {
//        this.width = width;
//        this.height = height;
//    }

    public static void main(String[] args) {
        // Rectangle 객체를 담는 ArrayList 생성
        ArrayList<Practice2> rectangles = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        // 사용자로부터 가로와 세로 입력받아 ArrayList 에 Rectangle 인스턴스 차례로 추가

        while(true) {
            System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
            int width = sc.nextInt();
            int height = sc.nextInt();

            if (width == 0 && height == 0) {
                break;
            }

            // rectangle 객체 만들기
            Practice2 rectangle = new Practice2(width); // width 여기서 넘겨줘야 생성자에서 쓸 수 있음.
            rectangle.setHeight(height); // 세로 길이 설정

            // ArrayList 에 Rectangle 객체 추가
            rectangles.add(rectangle);
        }

        // 입력된 Rectangle 객체들의 정보 출력
        System.out.println("\n입력된 Rectangle 정보 : ");

        // 반복문을 통해 ArrayList 출력
        for(Practice2 rectangle : rectangles) {
            System.out.println("가로 길이는 : " + rectangle.getWidth());
            System.out.println("세로 길이는 : " + rectangle.getHeight());
            System.out.println("넓이는 : " + rectangle.area());
            System.out.println("=============================");
        }
        sc.close();
    }
}