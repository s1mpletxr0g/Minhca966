package ss2_vung_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class TmUCLN {
    public static void main(String[] args) {
        int number1;
        int number2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi nhap number 1");
        number1 = scanner.nextInt();
        System.out.println("moi nhap number 2");
        number2 = scanner.nextInt();
        if (number1 == 0 || number2 == 0) {
            System.out.println("khong co UCLN cua hai so");
        } else {
            while (number1 != number2)
                if (number1 > number2) {
                    number1 = number1 - number2;
                } else {
                    number2 = number2 - number1;
                }
            System.out.println("UCLN la: " + number1);
        }
    }
}
