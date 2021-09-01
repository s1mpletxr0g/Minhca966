package ss22_contructural_design_patternt.thuc_hanh.trien_khai_facade;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" moi nhap idService");
        String idService = scanner.nextLine();
        Pattern pattern = Pattern.compile("^(SVRO-)(\\d){4}$");
//        Pattern pattern = Pattern.compile("^(SV)(RO)[-][\\d]{4}$");
        Matcher m = pattern.matcher(idService);
        System.out.println(m.matches());

    }
}
