package ss3_mang_cac_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class GopHaiMangVaoMotMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int []numBer1=new int [5];
        int []numBer2=new int [3];
        int []numBer3=new int[8];
        for(int i=0;i<5;i++){
            System.out.println("moi nhap phần tử thứ "+i +" mảng numBer1");
            numBer1[i]=scanner.nextInt();
            numBer3[i]=numBer1[i];
        }
        for(int j=0;j<3;j++){
            System.out.println("moi nhap phần tử thứ "+j+" mảng numBer2");
            numBer2[j]=scanner.nextInt();
            numBer3[numBer3.length+j-3]=numBer2[j];
        }
        for(int number: numBer3){
            System.out.print(number);
        }
    }
}
