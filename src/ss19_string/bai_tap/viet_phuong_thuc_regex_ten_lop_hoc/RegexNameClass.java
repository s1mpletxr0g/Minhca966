package ss19_string.bai_tap.viet_phuong_thuc_regex_ten_lop_hoc;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexNameClass {
    public static void regexNameClass(){

//        Scanner scanner= new Scanner(System.in);
//        System.out.println(" mời nhập tên lớp học A");
//        String nameClass=scanner.nextLine();
//        Pattern pattern=Pattern.compile("^([A|C|P])([\\d]){1,4}([G-M])$");
////        Pattern pattern=Pattern.compile("^([C|A|P])(\\d){4}(G|H|J|K|L)$");
//        Matcher m= pattern.matcher(nameClass);
//        System.out.println(m.matches());
        Scanner scanner= new Scanner(System.in);
        System.out.println(" moi nhap ten lop");
        String name= scanner.nextLine();
        Pattern pattern=Pattern.compile("^([A|C|P])([\\d]){4}([G-M])$");
        Matcher m=pattern.matcher(name);
        System.out.println(m.matches());


    }

    public static void main(String[] args) {
        regexNameClass();
    }
}
