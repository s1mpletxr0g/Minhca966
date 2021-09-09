package nhap.nhapregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String birthDay = scanner.nextLine();
        Pattern pattern= Pattern.compile("^(0[1-9])|(12[0-9])|(3[01])/(0[1-9])|(1[0-2])/((19)[2-9][0-9])|((200)[1-4])$");
        Matcher m= pattern.matcher(birthDay);
        System.out.println(m.matches());
    }

}
