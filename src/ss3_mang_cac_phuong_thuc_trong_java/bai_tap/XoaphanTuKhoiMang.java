package ss3_mang_cac_phuong_thuc_trong_java.bai_tap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class XoaphanTuKhoiMang {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi nhap vao phan tu can xoa");
        x = scanner.nextInt();
        int arrNew[];
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
            }
        }
        arr[arr.length - 1] = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
