package ss19_string.bai_tap.viet_phuong_thuc_regex_sdt;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPhone {
    public  static  void regex(){
        Scanner scanner =new Scanner(System.in);
        System.out.println(" moi nhap sdt");
        String phone=scanner.nextLine();
        Pattern pattern=Pattern.compile("^\\(84\\)-0[\\d]{9}");
        Matcher m=pattern.matcher(phone);
        System.out.println(m.matches());
    }

    public static void main(String[] args) {
        regex();
    }
}
