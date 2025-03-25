package ss4_inheritance_phonemanagement;

import java.util.Scanner;

public class Phone {
    private String id;
    private String name;
    private double price;
    private int warranty; // Thoi gian bao hanh
    private String manufacturer; // Hang san xuat

    public Phone() {
    }

    public Phone(String id, String name, int price, int warranty, String manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.warranty = warranty;
        this.manufacturer = manufacturer;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao ten dien thoai: ");
        this.name = scanner.nextLine();

        System.out.print("Nhap vao gia ban: ");
        this.price = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhap vao thoi gian bao hanh: ");
        this.warranty = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap vao hang san xuat: ");
        this.manufacturer = scanner.nextLine();
    }

    public void output() {
        System.out.println("ID: " + this.id);
        System.out.println("Ten dien thoai: " + this.name);
        System.out.println("Gia ban: " + this.price);
        System.out.println("Thoi gian ban hanh: " + this.warranty);
        System.out.println("Hang san xuat: " + this.manufacturer);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
