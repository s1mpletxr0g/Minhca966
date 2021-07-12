package ss11_generic_stack_queue.bai_tap.thap_phan_sang_nhi_phan;

import java.util.Scanner;

public class ThapPhanSangNhiPhan {
    public static void ThapPhanSangNhiPhan(){
        Scanner scanner= new Scanner(System.in);
        System.out.println(" mời nhập số cân chuyển đỏi");
        int number=scanner.nextInt();
        String nhiPhan=" ";
        while (number>0){
            nhiPhan = number%2 + nhiPhan;
            number=number/2;
        }
        System.out.println(nhiPhan);
    }
    public static void main(String[] args) {
        ThapPhanSangNhiPhan();
    }
}
