package ss3_mang_cac_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TinhTongDuongCheoChinhCuaMaTranVuong {
    public static void main(String[] args) {
        int size;
        Scanner scanner=new Scanner(System.in);
        System.out.println("mơi nhap do dai canh cua ma tran vuong");
        size=scanner.nextInt();
        int [][]arr=new int [size][size];

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.println("moi nhap phan tu tai vi tri: "+i+"."+j);
                arr[i][j]=scanner.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i==j){
                sum+=arr[i][j];
                }
            }

    }
        System.out.println("tong duong chao cua ma tran vuong la: "+ sum);
}
}
