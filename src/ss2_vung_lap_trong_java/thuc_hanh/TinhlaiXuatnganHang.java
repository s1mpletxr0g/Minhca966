package ss2_vung_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class TinhlaiXuatnganHang {
    public static void main(String[] args) {
        float tienGui;
        float thangGui;
        float tienLai;
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi nhap so tien gui");
        tienGui = scanner.nextInt();
        System.out.println("moi nhap phan tram lai xuat mot nam");
        float phanTramlaiXuat= scanner.nextInt();
         phanTramlaiXuat = phanTramlaiXuat / 100;
        System.out.println("moi nhap so thang gui");
        thangGui = scanner.nextInt();
        tienLai = tienGui * phanTramlaiXuat / 12 * thangGui;
        System.out.println("tien lai la: " + tienLai);

    }
}
