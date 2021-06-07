package ss3_mang_cac_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class DaoNguocPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi nhap so luong phan tu trong mang");
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("moi nhap phan tu  trong mang");
            arr[i] = scanner.nextInt();
        }
        int Arr;
        System.out.print("các phàn tử trong mảng sau khi đảo ngược là: ");
        for (int j = 0; j < arr.length; j++) {
            Arr = arr[arr.length - (j + 1)];
            System.out.print(Arr);
        }
    }
}
