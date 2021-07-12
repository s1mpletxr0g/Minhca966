package ss11_generic_stack_queue.bai_tap.kiem_tra_chuoi_polindrome;

import java.util.Scanner;

public class Palindrome {
    public  static  void Palindrome(){
        Scanner scanner=new Scanner(System.in);
        int[] arr ;
        System.out.println(" mời nhập số lượng index trong mảng");
        int n=scanner.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++) {
            System.out.println("nhap index thứ:" + i);
            arr[i] = scanner.nextInt();
        }
        boolean flag=true;
        for( int i=0;i<=n/2;i++){
            if(arr[i]!=arr[n-1-i]){
                flag=false;
                break;
            }
        }
        if(flag==false){
            System.out.println("  Mảng nhập vào không phải Palindrome");
        }else {
            System.out.println("mảng nhập vào là Palindrome ");
        }
    }

    public static void main(String[] args) {
        Palindrome();
    }
}
