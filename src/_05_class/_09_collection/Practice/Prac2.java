package _05_class._09_collection.Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prac2 {
    public static void main(String[] args) {
        // 이름, 나이 저장할 Map 생성
        Map<String, Integer> map = new HashMap<>();

        // 사용자로부터 입력 받기 Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("이름과 나이를 입력하세요. '종료'를 입력하면 종료됩니다.");

        while (true) {
            // 이름부터 입력 받음
            System.out.print("이름 입력 : ");
            String name = sc.nextLine();

            if(name.equals("종료")) {
                break;
            }

            System.out.print("나이 입력 : ");
            int age = sc.nextInt();
            sc.nextLine();

            // 이 때, 이름이 이미 존재하는 경우, 나이를 갱신 (덮어쓴다)
            map.put(name, age);
        }

        System.out.println("== 입력 받은 이름과 나이 목록 ==");

        // entrySet() 이용해서 for 반복
        // Set<Map.Entry<String, Integer>>
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
        System.out.println("이름: " + entry.getKey() + ", 나이: " + entry.getValue());}

        sc.close();
    }
}
