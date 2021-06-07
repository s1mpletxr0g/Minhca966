package ss3_mang_cac_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class CongPhanTuTrongMotCot {
    public static void main(String[] args) {
        int sum=0;
        int[][] arr = new int[][]{
                {1,2,3,},{1,2,3},{1,2,3}
        };
        Scanner scanner=new Scanner(System.in);
        System.out.println("mời nhập cột muốn tính tổng các phần tử");
        int number=scanner.nextInt();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][number];
        }
        System.out.println(sum);
    }
}
