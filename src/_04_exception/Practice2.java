package _04_exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("배열의 크기를 입력하십시오 : ");
            int size = sc.nextInt();

            System.out.println("배열 요소를 입력하십시오 : ");
            int[] arr = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.print("정수 " + (i+1) + ": ");
                arr[i] = sc.nextInt();
            }

            // 중복된 요소 찾기
            ArrayList<Integer> duplicates = findDuplicates(arr);

            // 중복된 요소 출력
            if (duplicates.isEmpty()) {
                System.out.println("중복된 요소가 없습니다.");
            } else {
                System.out.println("중복된 요소: " + duplicates);
            }
        } catch (InputMismatchException e) {
            System.out.println("정수를 입력하세요.");
        }
        }

        // 중복된 요소 찾는 메소드 만들기~!
        private static ArrayList<Integer> findDuplicates(int[] arr) {
            // 중복된 요소를 저장할, 반환할 ArrayList
            ArrayList<Integer> duplicates = new ArrayList<>();

            // 배열 순회하며 중복 찾기
            for (int i = 0; i < arr.length - 1; i++) {
                // 이중 for 문
                // 1 2 3 4 5
                // 1에 대해서 나머지 2,3,4,5가 중복된 값이 있는지 검사
                //  => i=0, j=1,2,3,4 => j = 1 ~ length-1
                // 2에 대해서 나머지 3,4,5가 중복된 값이 있는지 검사
                // 3에 대해서 4,5
                // 4에 대해서 5
                for (int j = i + 1; j < arr.length; j++) {
                    // 두 요소를 비교하여 중복 여부 확인
                    if (arr[i] == arr[j] && !duplicates.contains(arr[i])) {
                        // 중복된 요소 발견
                        duplicates.add(arr[i]);
                    }
                }
            }
            return duplicates;
        }
    }