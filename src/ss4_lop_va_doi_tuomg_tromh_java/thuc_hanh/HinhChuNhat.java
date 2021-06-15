package ss4_lop_va_doi_tuomg_tromh_java.thuc_hanh;

import java.util.Scanner;

public class HinhChuNhat {
    double weidth,height;
    public  HinhChuNhat(){

    }
    public HinhChuNhat(double weidth, double height) {
        this.weidth = weidth;
        this.height = height;
    }
    public double getArea(){
        return this.weidth*this.height;

    }
    public double getPerimeter(){
        return (this.weidth+this.height)*2;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("moi nhap chieu dai");
        double weidth=scanner.nextFloat();
        System.out.println("moi nhap chieu cao");
        double heigth=scanner.nextFloat();
        HinhChuNhat HChuNhat=new HinhChuNhat(weidth,heigth);
        System.out.println("chieu dai "+weidth +" va "+heigth+" dien tich hinh chu nhat la "+ HChuNhat.getArea());
        System.out.println("chieu dai "+weidth +" va "+heigth+" chu vi hinh chu nhat la "+ HChuNhat.getPerimeter());



    }

}
