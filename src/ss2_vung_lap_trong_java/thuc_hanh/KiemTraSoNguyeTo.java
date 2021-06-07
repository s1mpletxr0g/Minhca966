package ss2_vung_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraSoNguyeTo {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi nhap so can kiem tra");
        number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + "khong phai so nguyen to");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number + " this is a prime");
            } else {
                System.out.println(number + " this is not a prime");
            }
        }

    }
}
