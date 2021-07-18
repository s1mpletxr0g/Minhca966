package cong_an_giao_thong_den;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        XeMay xeMay = new XeMay();
        OTo oTo = new OTo();
        XeTai xeTai = new XeTai();
        int medium ;
        do {
            System.out.println(" chọn 1 để tương tác với đối tượng xe máy");
            System.out.println(" chọn 2 để tương tác với đối tượng ô tô");
            System.out.println(" chọn 3 để tương tác với đối tượng xe tải");
            System.out.println(" chọn 4 để ngừng tương tác");
            Scanner scanner = new Scanner(System.in);
             medium = scanner.nextInt();

            switch (medium) {
                case 1:
                    System.out.println(" chọn 1 để thêm xe máy");
                    System.out.println(" chọn 2 edit thông tin xe máy");
                    System.out.println(" chọn 3 delete ");
                    System.out.println(" chọn 4 để ngừng tương tác");
                    int choise = scanner.nextInt();
                    switch (choise) {
                        case 1:
                            xeMay.add();
                            break;
                        case 2:
                            xeMay.edit();
                            break;
                        case 3:
                            xeMay.delete();
                        case 4:
                        default:

                    }
                    break;
                case 2:
                    System.out.println(" chọn 1 để thêm ô tô");
                    System.out.println(" chọn 2 edit thông tin ô tô");
                    System.out.println(" chọn 3 delete ");
                    System.out.println(" chọn 4 để ngừng tương tác");
                    int choise2 = scanner.nextInt();
                    switch (choise2) {
                        case 1:
                            oTo.add();
                            break;
                        case 2:
                            oTo.edit();
                            break;
                        case 3:
                            oTo.delete();
                        case 4:
                        default:
                    }
                    break;
                case 3:
                    System.out.println(" chọn 1 để thêm xe tải");
                    System.out.println(" chọn 2 edit thông tin xe tải");
                    System.out.println(" chọn 3 delete ");
                    System.out.println(" chọn 4 để ngừng tương tác");
                    int choise3 = scanner.nextInt();
                    switch (choise3) {
                        case 1:
                            xeTai.add();
                            break;
                        case 2:
                            xeTai.edit();
                            break;
                        case 3:
                            xeTai.delete();
                        case 4:
                        default:
                    }
                    break;
                case 4:
                default:
            }

        } while(medium!=4);
    }
}