package ss4_inheritance;

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

        this.id = (int) (Math.random() * 10000);

        System.out.print("Nhap vao ten: ");
        this.name = scanner.nextLine();
    }

    public void output() {
        System.out.println("ID: " + this.id);
        System.out.println("Ten cua hoc sinh la: " + this.name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
