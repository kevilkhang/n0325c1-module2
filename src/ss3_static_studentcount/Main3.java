package ss3_static_studentcount;

import java.util.ArrayList;

public class Main3 {
    static ArrayList<Integer> integers = new ArrayList<>();
    // Khoi static (Khai bao gia tri static ban dau, lam cho main gon hon, tiet kiem vung nho)
    static {
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
    }

    public static void main(String[] args) {
        System.out.println(integers);
    }
}
