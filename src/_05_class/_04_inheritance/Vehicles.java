package _05_class._04_inheritance;

public class Vehicles {
    private String name;
    private String brand;
    private String model;
    private int year;

    // 생성자
    Vehicles(String name, String brand, String model, int year) {
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // 메소드
    public void runStatus() {
        System.out.println("");
    }

}
