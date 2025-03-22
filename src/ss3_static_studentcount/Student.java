package ss3_static_studentcount;

public class Student {
    // Khai bao
    private int studentCode;
    private String name;
    private double score;
    // Khai bao bien dem
    private static int studentCount = 0;

    // Constructor

    // Truong hop 0 tham so
    public Student() {
        studentCount++;
    }


    // Truong hop 2 tham so
    public Student(int studentCode, String name) {
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
        // Bien dem duoc them vao khi cac constructor duoc tao ra
        studentCount++;
    }

    // Truong hop 3 tham so
    public Student(int studentCode, String name, double score) {
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
        // Bien dem duoc them vao khi cac constructor duoc tao ra
        studentCount++;
    }

    // Getter and Setter
    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public static int getStudentCount() {
        return studentCount;
    }
}
