package ss2_vung_lap_trong_java.bai_tap;

import java.util.Scanner;

public class VeHinh {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("so 1 hinh chu nha, so 2 hinh tam gac vuong, so 3 tam giac can");
        number = scanner.nextInt();
        switch (number) {
            case 1:
                int[][] a = new int[5][9];
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 9; j++) {
                        if (i == 1 || i == 5 || j == 1 || j == 9) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();

                }
                break;
            case 2:
                int[][] b = new int[5][5];
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 5; j++) {
                        if (i == 5 || j == i || j == 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();

                }
                break;
            case 3:
                int[][] c = new int[5][9];
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 9; j++) {
                        if (i == 5 || j == i + 4 || j == -i + 6) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
        }
    }
}
