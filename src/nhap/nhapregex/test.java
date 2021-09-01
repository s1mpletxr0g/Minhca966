package nhap.nhapregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" moi nhap ten dich vu");
        String nameService = scanner.nextLine();
//        Pattern p = Pattern.compile("(?=.*?[A-Z])(?=.*?[a-z])");
        Pattern pattern=Pattern.compile("^[A-Z][a-z]{40}$");
//        Pattern pattern=Pattern.compile("(?=.*?[A-Z])(?=.*?[a-z])");
        Matcher m= pattern.matcher(nameService);
        System.out.println(m.matches());

    }
}
