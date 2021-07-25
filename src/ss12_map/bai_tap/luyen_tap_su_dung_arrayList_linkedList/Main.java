package ss12_map.bai_tap.luyen_tap_su_dung_arrayList_linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product=new Product("kẹo dừa",20000);
        int choise;
        do{System.out.println("Menu");
        System.out.println(" chọn 1: thêm sản phẩm");
        System.out.println("chọn 2: sửa thông tin sản phẩm");
        System.out.println(" chọn 3: xóa sản phẩm ");
        System.out.println(" chọn 4: tìm sản phẩm");
        System.out.println(" chọn 5: sắp xép giá sản phẩm theo chiều tăng dần");
            System.out.println(" chọn 6: để thoát chương trình ");
        Scanner scanner=new Scanner(System.in);

        choise=scanner.nextInt();
        switch (choise){
            case 1:
                product.add();
                break;
            case 2:
                product.edit();
                break;
            case 3:
                product.delete();
                break;
            case 4:
                product.search();
                break;
            case 5:
                product.sapxep();

                break;

        }

    }while (choise!=6);
}
}
