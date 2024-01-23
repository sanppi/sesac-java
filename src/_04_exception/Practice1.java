package _04_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("배열 크기 입력 >> ");
            int num = sc.nextInt();

            // 예외 처리
            if (num <= 0) {
                throw new IllegalArgumentException("배열 크기는 1이상이어야 합니다.");
            }

            // 배열 생성
            int[] arr = new int[num];

            // 배열 요소 입력
            System.out.println(num + "개의 정수 입력 >> ");

            int sum = 0;
            for (int i = 0; i < num; i++) {
                System.out.print("정수 " + (i+1) + ": ");
                arr[i] = sc.nextInt();
                sum += arr[i];
            }

            // 평균 계산
            double average = (double) sum / num;
            System.out.println("평균은 " + average + "입니다.");

        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력 형십입니다.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
