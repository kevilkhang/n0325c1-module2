package ss1_oop_point;

import java.util.Scanner;

public class Point {
    double x;
    double y;

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap toa do x cua diem : ");
        x = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhap toa đo y cua diem : ");
        y = Double.parseDouble(scanner.nextLine());
    }

    double distanceTo(Point point) {
        return Math.sqrt(Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2));
    }
}
