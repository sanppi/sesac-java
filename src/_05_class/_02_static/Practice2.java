package _05_class._02_static;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice2 {
    // 1. 필드(변수) 정의
    private String name;
    private int id;
    private int grade;

    // 클래스 변수 (static 변수) 총 학생수, 0으로 초기화 해주기
    private static int totalStudents = 0;

    // 생성자
    public Practice2(String name, int id, int grade) {
        // 생성자로 이름, 학번, 학년 초기화, totalStudents 증가
        // 지금 매개변수랑 필드명 같으니깐 this 로!
        this.name = name;
        this.id = id;
        this.grade = grade;
        totalStudents++;
    }

    // 각 필드에 대한 getter, setter 추가
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    // 학생 정보 출력하는 displayInfo 메서드 정의
    public void displayInfo() {
        System.out.println("====== 학생 정보 ======");
        System.out.println("이름: " + this.getName()); // 그냥 name, id, grade 이렇게 넣어도 됨
        System.out.println("학번: " + this.getId());
        System.out.println("학년: " + this.getGrade());
    }

    // 클래스 변수 getter
    public static int getTotalStudents() {
        return totalStudents;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Rectangle 객체를 담는 ArrayList 생성
        ArrayList<Practice2> students = new ArrayList<>();

        while (true) {
            System.out.println("이름, 학번, 학년을 띄어쓰기 해서 입력해주세요. (종료: exit)");
            String input = sc.nextLine();

            if (input.trim().equalsIgnoreCase("exit")) {
                break;
            }

            String[] parts = input.split(" ");

            if (parts.length == 3) {
                String name = parts[0];
                int id = Integer.parseInt(parts[1]);
                int grade = Integer.parseInt(parts[2]);

                Practice2 student = new Practice2(name, id, grade);
                students.add(student);
            } else {
                System.out.println("잘못된 입력입니다. 이름, 학번, 학년을 띄어쓰기로 구분하여 입력해주세요.");
            }
        }

        for(Practice2 student : students) {
            student.displayInfo();
        }

        System.out.println("======================");
        System.out.println("총 학생 수는: " + Practice2.getTotalStudents());
        sc.close();
    }
}
