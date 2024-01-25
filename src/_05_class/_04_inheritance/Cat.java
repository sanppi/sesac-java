package _05_class._04_inheritance;

// Cat 클래스, Animal 클래스를 상속 받음
public class Cat extends Animal {
    // 생성자
    public Cat(String name, int age) {
        // Animal 클래스의 생성자 호출하여 초기화
        // 왜? Animal 클래스(부모 클래스)가 매개변수를 받는 생성자 가지니깐.
        // name, age 는 아직 값이 없으니 객체를 만들 때 받아서 넘겨주기.
        super("고양이", name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("meow");
    }
}
