package _05_class._05_abstract;

import javax.swing.text.html.parser.TagElement;

public abstract class Student {
    // 필드
    String name;
    String school;
    int age;
    int id;

    // 생성자
    public Student(String name, String school, int age, int id) {
        this.name = name;
        this.school = school;
        this.age = age;
        this.id = id;
    }

    // 추상메소드
    abstract void todo();

    // getter
    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }
}
