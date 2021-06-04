package ss1_Introduction_to_Java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        int VND;
        int USD;
        int result;
        Scanner scanner=new Scanner(System.in);
        System.out.println("moi nhap so USD can doi sang VND");
        USD=scanner.nextInt();
        result=USD*23000;
        System.out.println(result+ "VND");

    }
}
