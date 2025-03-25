package ss4_inheritance_phonemanagement;

import java.util.Scanner;

public class OldPhone extends Phone {
    private int batteryPercentage;
    private String descripton;

    public OldPhone() {
    }

    public OldPhone(String id, String name, int price, int warranty, String manufacturer, int batteryPercentage, String descripton) {
        super(id, name, price, warranty, manufacturer);
        this.batteryPercentage = batteryPercentage;
        this.descripton = descripton;
    }

    @Override
    public void input() {
        super.input();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao tinh trang pin (%): ");
        this.batteryPercentage = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap vao mo ta them: ");
        this.descripton = scanner.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Tinh trang pin (%): " + this.batteryPercentage);
        System.out.println("Mo ta them: " + this.descripton);
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }
}
