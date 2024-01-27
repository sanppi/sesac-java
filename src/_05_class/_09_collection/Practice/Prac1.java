package _05_class._09_collection.Practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Prac1 {
    public static void main(String[] args) {
        // 사용자로부터 입력 받기 위한 Scanner
        Scanner sc = new Scanner(System.in);

        // 중복 제거를 위한 HashSet 생성
        Set<Integer> integers = new HashSet<>();

        System.out.println("정수를 입력하세요. -1 을 입력하면 종료됩니다.");

        while (true) {
            System.out.print("정수 입력 : ");
            int input = sc.nextInt();
            if (input == -1) {
                break;
            }
            integers.add(input);
        }
        System.out.println("중복 제거된 정수 목록: " + integers);

        sc.close();
    }
}
