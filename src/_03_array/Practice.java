package _03_array;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        // 5개의 정수를 입력 받을 배열 생성
        int[] intArray = new int[5];

        System.out.println("5개의 정수를 입력하세요. >> ");
        Scanner sc = new Scanner(System.in);

        // 평균 계산
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            intArray[i] = sc.nextInt();
            sum += intArray[i];
        }

        double average = (double) sum / 5;
        System.out.println("평균은 " + average);

        sc.close();
    }
}
