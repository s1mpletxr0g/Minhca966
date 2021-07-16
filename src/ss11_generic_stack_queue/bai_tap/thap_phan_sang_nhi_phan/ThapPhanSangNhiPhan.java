package ss11_generic_stack_queue.bai_tap.thap_phan_sang_nhi_phan;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ThapPhanSangNhiPhan {
    public static void ThapPhanSangNhiPhan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" mời nhập số cân chuyển đỏi");

        Stack<String> arrNumber = new Stack<>();
        int number = scanner.nextInt();

        while (number > 0) {
            arrNumber.push(number % 2 +"");
            number = number / 2;
        }
        System.out.println(" trước khi chuyển sang hệ nhị phân");
        System.out.println(arrNumber);
        System.out.println(" sau khi chuyển sang hệ nhị phân");
        while (!arrNumber.isEmpty()){
            System.out.print(arrNumber.pop());
        }
    }
    public static void main(String[] args) {
        ThapPhanSangNhiPhan();
    }
}
