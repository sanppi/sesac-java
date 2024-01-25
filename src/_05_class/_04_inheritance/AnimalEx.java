package _05_class._04_inheritance;

public class AnimalEx {
    public static void main(String[] args) {
        // Cat, Dog 객체 생성
        Cat cat = new Cat("꽁지", 4);
        Dog dog = new Dog("해피", 3);

        // Cat, Dog 객체의 속성 및 메소드 확인
        // 고양이 정보 출력
        System.out.println("종: " + cat.getSpecies()); // 자식 클래스 객체로 부모 클래스의 메소드 호출 가능하니깐
        System.out.println("이름: " + cat.getName());
        System.out.println("나이: " + cat.getAge());
        System.out.print("울음 소리: " );
        cat.makeSound();

        System.out.println("============================");
        // 강아지 정보 출력
        System.out.println("종: " + dog.getSpecies());
        System.out.println("이름: " + dog.getName());
        System.out.println("나이: " + dog.getAge());
        System.out.print("울음 소리: " );
        dog.makeSound();
    }
}
