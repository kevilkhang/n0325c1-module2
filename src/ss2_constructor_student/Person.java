package ss2_constructor_student;

import java.util.Scanner;

public class Person {
    private int id;
    private String name;

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        this.id = (int) (Math.random() * 1000000);

        System.out.print("Nhập vào tên ");
        this.name = scanner.nextLine();
    }

    public void output() {
        System.out.println("ID : " + this.id);
        System.out.println("Name : " + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}