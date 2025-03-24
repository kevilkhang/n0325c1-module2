package ss2_constructor_student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Bùi Quang Khang", 8.5);

        System.out.println("Thông tin ban đầu:");
        System.out.println("ID: " + student1.getId());
        System.out.println("Tên: " + student1.getName());
        System.out.println("Điểm số: " + student1.getScore());

        student1.setName("Bùi Quang Khang");
        student1.setScore(9.0);

        System.out.println("Thông tin sau khi cập nhật:");
        System.out.println("ID: " + student1.getId());
        System.out.println("Tên: " + student1.getName());
        System.out.println("Điểm số: " + student1.getScore());

        student1.setName(" ");
        student1.setScore(11.5);

    }
}