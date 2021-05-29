package ss1_Introduction_to_Java.thuc_hanh;

import java.util.Scanner;

public class TinhNamNhuan {
    public static void main(String[] args) {
        int nam;
        Scanner scanner=new Scanner(System.in);
        System.out.println("moi nhap nam");
        nam=scanner.nextInt();
        if(nam%4==0){
            if(nam%100!=0){
                System.out.println("nam: "+nam+" la nam nhuan");
            }else if(nam%400!=0){
                System.out.println("nam: "+nam+" khong phai nam nhuan");
            }else{
                System.out.println("nam: "+nam+" la nam nhuan");
        }
        }else{
            System.out.println("nam: "+nam+" khong phai nam nhuan");
        }
    }
}
