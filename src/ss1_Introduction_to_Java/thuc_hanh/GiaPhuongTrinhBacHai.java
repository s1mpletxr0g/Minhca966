package ss1_Introduction_to_Java.thuc_hanh;

import java.util.Scanner;

public class GiaPhuongTrinhBacHai {
    public static void main(String[] args) {
        System.out.println("gia phuong trinh bac hai\n");
        System.out.println("phuong trinh co dang a*x+b=c");
        Scanner input=new Scanner(System.in);
        float x=0;
        System.out.println("moi nhap a");
        float a=input.nextFloat();
        System.out.println("moi nhap b");
        float b=input.nextFloat();
        System.out.println("moi nhap c");
        float c=input.nextFloat();
        if(a!=0){
            x=(c-b)/a;
            System.out.println(x);
        }
        else if(b==c){
            System.out.println("phuong trinh vo so nghiem");
        }else{
            System.out.println("phuong trinh vo nghiem");
        }
    }
}
