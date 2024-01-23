package _04_exception;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        int[] numbers = new int [4];

        try {
            for (int i = 0; i < 5; i++) {
                numbers[i] = i + 1;
                System.out.println(numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스가 범위를 벗어났습니다.");
        }
    }
}
