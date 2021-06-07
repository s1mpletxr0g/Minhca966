package ss3_mang_cac_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int x;
        int index;
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 0, 0};
        int[] newA = new int[arr.length + 1];
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi nhap gia tri muon chen");
        x = scanner.nextInt();
        System.out.println("moi nhap vi tri muon chen");
        index = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            newA[i] = arr[i];
        }
        for (int i = newA.length - 1; i > index; i--) {
            newA[i] = newA[i - 1];
        }
        newA[index] = x;
        for (int i = 0; i < newA.length; i++) {
            System.out.print(newA[i]);
        }
    }
}
