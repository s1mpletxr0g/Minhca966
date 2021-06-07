package ss3_mang_cac_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class HienThiTenSinhVien {
    public static void main(String[] args) {
        String Arr[] = {"Lan", "Huệ", "Đào", "Cúc", "Trang"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời nhập tên cần tìm");
        String name = scanner.nextLine();
        for (int i = 0; i < Arr.length; i++) {
            if (name.equals(Arr[i])){
                System.out.println("bạn " + Arr[i] + " ở vị trí thứ " + ++i);
            }
        }
    }
}

