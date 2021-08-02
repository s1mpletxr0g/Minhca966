package ss13_binarySearch.bai_tap.tim_kiem_phan_tu_trong_mang_bang_nhi_phan;

import java.util.Scanner;

public class BinarySearch1 {
//    private int[] arr = new int[10];
//
//    int value;
//
//    public BinarySearch1() {
//    }
//
//    public BinarySearch1(int[] arr, int value) {
//        this.arr = arr;
//
//        this.value = value;
//    }
//
//    public int[] getArr() {
//        return arr;
//    }
//
//    public void setArr(int[] arr) {
//        this.arr = arr;
//    }
//
//
//    public int getValue() {
//        return value;
//    }
//
//    public void setValue(int value) {
//        this.value = value;
//    }
//
//    public int binarySearch() {
//        Scanner scanner = new Scanner(System.in);
//        int mid;
//        int left = 0;
//        int right = arr.length - 1;
//        System.out.println(" mời nhập vào phần tử cần tìm vị trí");
//        value = scanner.nextInt();
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(" mời nhập phần tử thứ " + i);
//            arr[i] = scanner.nextInt();
//        }
//        while (left <= right) {
//            mid = (left + right) / 2;
//            if (value == arr[mid]) {
//                return mid;
//            } else if (value < arr[mid]) {
//                right = mid - 1;
//            } else {
//                left = mid + 1;
//            }
//        }
//        return -1;
//    }
    public static int binarySearch(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        int value;
        int mid;
        int left = 0;
        int right = arr.length - 1;
        System.out.println(" mời nhập vào giá trị cần tìm vị trí");
        value = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" mời nhập phần tử thứ " + i);
            arr[i] = scanner.nextInt();
        }
        while (left <= right) {
            mid = (left + right) / 2;

            if (value == arr[mid]) {
                return mid;
            } else if (value < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println( binarySearch(arr));
    }
}
