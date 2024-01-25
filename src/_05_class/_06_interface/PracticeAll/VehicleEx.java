package _05_class._06_interface.PracticeAll;

import java.util.ArrayList;

public class VehicleEx {
    public static void main(String[] args) {
        // Vehicle 배열 생성
        Vehicle[] vehicles = new Vehicle[2];

        // ArrayList<Vehicle> vehicle = new ArrayList<>(); -> 난 이 방법으로 하고 싶은데..

        // Car 객체 생성 및 배열에 저장
        Car car = new Car("자동차", 100);
        vehicles[0] = car;

        // Airplane 객체 생성 및 배열에 저장
        Airplane airplane = new Airplane("비행기", 500);
        vehicles[1] = airplane;

        // 추가
        // 상위 -> 하위 : () 명시
        // 하위 -> 상위 : 생략 가능

        // Vehicle 이 상위 부모라 car, airplane 객체 다 담을 수 있음. extends 하고 있음.
        // 배열 순회하며 출력
        for(Vehicle vehicle : vehicles) {
            System.out.println("이름 : " + vehicle.getName());
            vehicle.move();

//            System.out.println(vehicle instanceof Flyable); // false, true 로 나옴
            // Flyable 구현한 경우 fly() 메서드를 호출
            if (vehicle instanceof Flyable) {
                ((Flyable) vehicle).fly(); // 형변환(캐스팅) 해서 fly 실행
            }
        }
    }

}
