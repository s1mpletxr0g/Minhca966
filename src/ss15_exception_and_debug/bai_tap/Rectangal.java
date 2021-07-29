package ss15_exception_and_debug.bai_tap;

import java.util.Scanner;

public class Rectangal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" moi nhập canh a");
        int a = scanner.nextInt();

        System.out.println("mời nhập cạnh b");
        int b = scanner.nextInt();
        System.out.println(" mời nhập cạnh c");
        int c = scanner.nextInt();
        if( a*a==b*b+c*c || b*b==a*a+c*c || c*c== a*a+b*b) {
            System.out.println(" a , b, c la ba canh tam giác ");
        }
        Rectangal rectangal= new Rectangal();
        rectangal.rectangel1(a,b,c);
    }
    public  static void rectangel1(int a, int b, int c){
        try{
            System.out.println(" ba cah trên la hình tam giác");
        }catch(Exception e){
            System.out.println(" ba cạnh nhập vào ko phải tam giác");
        }
    }

}

