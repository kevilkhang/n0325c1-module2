package ss4_inheritance_phonemanagement;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Hiển thị menu chính
            showMainMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1: viewPhoneList(scanner); break;
                case 2: addNewPhone(scanner); break;
                case 3: updatePhone(); break;
                case 4: deletePhone(); break;
                case 5: sortByPrice(scanner); break;
                case 6: searchPhones(scanner); break;
                case 7: calculateTotalPrice(); break;
                case 8: discountOldPhones(); break;
                case 9: System.out.println("Thoat."); break;
                default: System.out.println("Lua chon khong hop le. Vui long chon lai."); break;
            }

        } while (choice != 9);

        scanner.close();
    }

    // Menu chính
    private static void showMainMenu() {
        System.out.println("-- CHUONG TRINH QUAN LY DIEN THOAI--");
        System.out.println("1. Xem danh sach dien thoai");
        System.out.println("2. Them moi");
        System.out.println("3. Cap nhat");
        System.out.println("4. Xoa");
        System.out.println("5. Sap xep theo gia");
        System.out.println("6. Tim kiem");
        System.out.println("7. Tinh tong tien");
        System.out.println("8. Giam gia cho dien thoai cu");
        System.out.println("9. Thoat");
        System.out.print("Chon chuc nang theo so: ");
    }

    // Xem danh sách điện thoại
    private static void viewPhoneList(Scanner scanner) {
        int subChoice1;
        do {
            System.out.println("-- XEM DANH SACH DIEN THOAI --");
            System.out.println("1. Xem tat ca");
            System.out.println("2. Xem dien thoai cu");
            System.out.println("3. Xem dien thoai moi");
            System.out.println("4. Tro ve menu chinh");
            System.out.print("Chon chuc nang theo so: ");
            subChoice1 = scanner.nextInt();

            switch (subChoice1) {
                case 1: System.out.println("Xem tat ca..."); break;
                case 2: System.out.println("Xem dien thoai cu..."); break;
                case 3: System.out.println("Xem dien thoai moi..."); break;
                case 4: System.out.println("Tro ve menu chinh."); break;
                default: System.out.println("Lua chon khong hop le. Vui long chon lai."); break;
            }
        } while (subChoice1 != 4);
    }

    // Thêm mới điện thoại
    private static void addNewPhone(Scanner scanner) {
        int subChoice2;
        do {
            System.out.println("-- THEM MOI --");
            System.out.println("1. Them moi dien thoai cu");
            System.out.println("2. Them moi dien thoai moi");
            System.out.println("3. Tro ve menu chinh");
            System.out.print("Chon chuc nang theo so: ");
            subChoice2 = scanner.nextInt();

            switch (subChoice2) {
                case 1: System.out.println("Them moi dien thoai cu..."); break;
                case 2: System.out.println("Them moi dien thoai moi..."); break;
                case 3: System.out.println("Tro ve menu chinh."); break;
                default: System.out.println("Lua chon khong hop le. Vui long chon lai."); break;
            }
        } while (subChoice2 != 3);
    }

    // Cập nhật điện thoại
    private static void updatePhone() {
        System.out.println("Cap nhat...");
    }

    // Xóa điện thoại
    private static void deletePhone() {
        System.out.println("Xoa...");
    }

    // Sắp xếp điện thoại theo giá
    private static void sortByPrice(Scanner scanner) {
        int subChoice5;
        do {
            System.out.println("-- SAP XEP THEO GIA --");
            System.out.println("1. Tang dan");
            System.out.println("2. Giam dan");
            System.out.println("3. Tro ve menu chinh");
            System.out.print("Chon chuc nang theo so: ");
            subChoice5 = scanner.nextInt();

            switch (subChoice5) {
                case 1: System.out.println("Tang dan..."); break;
                case 2: System.out.println("Giam dan..."); break;
                case 3: System.out.println("Tro ve menu chinh."); break;
                default: System.out.println("Lua chon khong hop le. Vui long chon lai."); break;
            }
        } while (subChoice5 != 3);
    }

    // Tìm kiếm điện thoại
    private static void searchPhones(Scanner scanner) {
        int subChoice6;
        do {
            System.out.println("-- TIM KIEM --");
            System.out.println("1. Tim kiem tat ca dien thoai");
            System.out.println("2. Tim kiem dien thoai cu");
            System.out.println("3. Tim kiem dien thoai moi");
            System.out.println("4. Tro ve menu chinh");
            System.out.print("Chon chuc nang theo so: ");
            subChoice6 = scanner.nextInt();

            switch (subChoice6) {
                case 1: searchAllPhones(scanner); break;
                case 2: searchOldPhones(scanner); break;
                case 3: searchNewPhones(scanner); break;
                case 4: System.out.println("Tro ve menu chinh."); break;
                default: System.out.println("Lua chon khong hop le. Vui long chon lai."); break;
            }
        } while (subChoice6 != 4);
    }

    // Tìm kiếm tất cả điện thoại
    private static void searchAllPhones(Scanner scanner) {
        int subMenu1Choice6;
        do {
            System.out.println("-- TIM KIEM TAT CA DIEN THOAI --");
            System.out.println("1. Tim kiem theo gia");
            System.out.println("2. Tim kiem theo ten");
            System.out.println("3. Tim kiem theo hang");
            System.out.println("4. Tro ve menu Tim kiem");
            System.out.print("Chon chuc nang theo so: ");
            subMenu1Choice6 = scanner.nextInt();

            switch (subMenu1Choice6) {
                case 1: System.out.println("Tim kiem theo gia..."); break;
                case 2: System.out.println("Tim kiem theo ten..."); break;
                case 3: System.out.println("Tim kiem theo hang..."); break;
                case 4: System.out.println("Tro ve menu Tim kiem."); break;
                default: System.out.println("Lua chon khong hop le. Vui long chon lai."); break;
            }
        } while (subMenu1Choice6 != 4);
    }

    // Tìm kiếm điện thoại cũ
    private static void searchOldPhones(Scanner scanner) {
        int subMenu2Choice6;
        do {
            System.out.println("-- TIM KIEM DIEN THOAI CU --");
            System.out.println("1. Tim kiem theo gia");
            System.out.println("2. Tim kiem theo ten");
            System.out.println("3. Tim kiem theo hang");
            System.out.println("4. Tro ve menu Tim kiem");
            System.out.print("Chon chuc nang theo so: ");
            subMenu2Choice6 = scanner.nextInt();

            switch (subMenu2Choice6) {
                case 1: System.out.println("Tim kiem theo gia..."); break;
                case 2: System.out.println("Tim kiem theo ten..."); break;
                case 3: System.out.println("Tim kiem theo hang..."); break;
                case 4: System.out.println("Tro ve menu Tim kiem."); break;
                default: System.out.println("Lua chon khong hop le. Vui long chon lai."); break;
            }
        } while (subMenu2Choice6 != 4);
    }

    // Tìm kiếm điện thoại mới
    private static void searchNewPhones(Scanner scanner) {
        int subMenu3Choice6;
        do {
            System.out.println("-- TIM KIEM DIEN THOAI MOI --");
            System.out.println("1. Tim kiem theo gia");
            System.out.println("2. Tim kiem theo ten");
            System.out.println("3. Tim kiem theo hang");
            System.out.println("4. Tro ve menu Tim kiem");
            System.out.print("Chon chuc nang theo so: ");
            subMenu3Choice6 = scanner.nextInt();

            switch (subMenu3Choice6) {
                case 1: System.out.println("Tim kiem theo gia..."); break;
                case 2: System.out.println("Tim kiem theo ten..."); break;
                case 3: System.out.println("Tim kiem theo hang..."); break;
                case 4: System.out.println("Tro ve menu Tim kiem."); break;
                default: System.out.println("Lua chon khong hop le. Vui long chon lai."); break;
            }
        } while (subMenu3Choice6 != 4);
    }

    // Tính tổng tiền
    private static void calculateTotalPrice() {
        System.out.println("Tinh tong tien...");
    }

    // Giảm giá cho điện thoại cũ
    private static void discountOldPhones() {
        System.out.println("Giam gia cho dien thoai cu...");
    }
}
