package ss3_mang_cac_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TimPhanTuNhoNhattrongMang {
    public static void main(String[] args) {
        int size1;
        int size2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("moi nhap so hang");
        size1=scanner.nextInt();
        System.out.println("moi nhap so cot");
        size2=scanner.nextInt();
        int [][]arr=new int [size1][size2];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("moi nhap "+i+"."+j);
                arr[i][j]=scanner.nextInt();
            }
        }
        int min=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("moi nhap "+i+"."+j);
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("phan tu có giá trị nho nhat la "+ min);
    }
}
