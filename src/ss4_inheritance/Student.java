package ss4_inheritance;

import java.util.Scanner;

public class Student extends Person {
    public double score;

    public Student() {
        super();
    }

    public Student(int id, String name, double score) {
        super(id, name);
        this.score = score;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);

        super.input();

        System.out.print("Nhap vao diem: ");
        this.score = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void output() {
        super.output();

        System.out.println("Diem cua hoc sinh la: " + score);
    }
}
