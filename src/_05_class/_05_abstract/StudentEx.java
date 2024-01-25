package _05_class._05_abstract;

public class StudentEx {
    public static void main(String[] args) {
        Kim kim = new Kim("김철수", "ABC 고등학교", 17, 123456);
        Baek baek = new Baek("백영희", "XYZ 고등학교", 18, 78910);

        System.out.println(kim.getName() + " 학생의 정보");
        System.out.println("학교: " + kim.getSchool()); // kim.age, kim.school 이런식으로 접근 가능
        System.out.println("나이: " + kim.getAge());
        System.out.println("학번: " + kim.getId());
        kim.todo();

        System.out.println("===========================");
        System.out.println(baek.getName() + " 학생의 정보");
        System.out.println("학교: " + baek.getSchool());
        System.out.println("나이: " + baek.getAge());
        System.out.println("학번: " + baek.id); // baek 타고 들어가서 그냥 id 로 접근 가능한 건가봄
        baek.todo();



    }
}
