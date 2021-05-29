package ss1_Introduction_to_Java.thuc_hanh;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {

        float weight;
        float high;
        Scanner sc=new Scanner(System.in);
        System.out.println("moi nhap wieght");
        weight=sc.nextFloat();
        System.out.println("moi nhap hight");
        high=sc.nextFloat();
        double s=weight*high;
        System.out.println(s);

    }
}
