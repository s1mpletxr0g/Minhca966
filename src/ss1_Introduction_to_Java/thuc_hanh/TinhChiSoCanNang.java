package ss1_Introduction_to_Java.thuc_hanh;

import java.util.Scanner;

public class TinhChiSoCanNang {
    public static void main(String[] args) {
       float weight;
       float high;
       double bmi;
       Scanner scanner=new Scanner(System.in);
        System.out.println("moi nhap can nang");
       weight=scanner.nextFloat();
        System.out.println("moi nhap chieu cao");
        high=scanner.nextFloat();
        bmi=weight/Math.pow(high,2);
        if(bmi<18.8){
            System.out.println("underweight");
        }else if(bmi<25){
            System.out.println("normal");
        }else if(bmi<30){
            System.out.println("overweight");
        }else{
            System.out.println("obese");
        }

    }
}
