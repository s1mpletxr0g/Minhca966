package ss1_Introduction_to_Java.thuc_hanh;

import java.util.Scanner;

public class TinhNgayTrongThang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("moi nhap thang");
        int thang = input.nextInt();
        switch (thang) {
            case 1:
                System.out.println("31 ngay");
                break;
            case 2:
                System.out.println("28 hoac 29 ngay");
                break;
            case 3:
                System.out.println("31 ngay");
                break;
            case 4:
                System.out.println("30  ngay");
                break;
            case 5:
                System.out.println("31 ngay");
                break;
            case 6:
                System.out.println("30 ngay");
                break;
            case 7:
                System.out.println("31 ngay");
                break;
            case 8:
                System.out.println("31 ngay");
                break;
            case 9:
                System.out.println("30  ngay");
                break;
            case 10:
                System.out.println("31 ngay");
                break;
            case 11:
                System.out.println("30  ngay");
                break;
            case 12:
                System.out.println("31 ngay");
                break;
            default:
                System.out.println("nhap thang khong dung");
        }
    }
}


