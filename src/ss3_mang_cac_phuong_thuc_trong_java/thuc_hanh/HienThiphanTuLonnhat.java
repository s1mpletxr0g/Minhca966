package ss3_mang_cac_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class HienThiphanTuLonnhat {
    public static void main(String[] args) {
        int size;
        int[] Array;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("mời nhập số lượng tỷ phú muốn so sánh");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("danh sách so sánh quá lớn");
            }
        } while (size > 20);
        Array = new int[size];
        int max = Array[0];
        for (int i = 0; i < size; i++) {
            System.out.println("mời nhập số tiền của tỷ phú thứ " + +(i + 1));
            Array[i] = scanner.nextInt();
            if (Array[i] > max) {
                max = Array[i];
                count = i + 1;
            }
        }
        System.out.println("tỷ phú giàu nhất là tỷ phú số " + count + " với số tiền là " + max);
    }
}
