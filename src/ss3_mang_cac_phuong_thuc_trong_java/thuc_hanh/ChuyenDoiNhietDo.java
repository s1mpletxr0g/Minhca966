package ss3_mang_cac_phuong_thuc_trong_java.thuc_hanh;

import org.jcp.xml.dsig.internal.dom.ApacheNodeSetData;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("chọn 1 để chuyển fahrenheit To Celcius ");
            System.out.println("chọn 2 để chuyển celcius To Fahrenheit ");
            System.out.println("chọn 0 để exit ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(" mơi nhập nhiệt độ fahrenheit cần chuyển đổi ");
                    fahrenheit = scanner.nextFloat();
                    System.out.println(" fahrenheit To Celcius là: " + fahrenheitToCelcius(fahrenheit));
                    break;
                case 2:
                    System.out.println(" mời nhập nhiệt độ celcius cần chuyển đỏi");
                    celsius = scanner.nextFloat();
                    System.out.println(" celcius To Fahrenheit là: " + celciusToFahrenheit(celsius));
                    break;
                case 0:
                    break;
            }
        } while (choice != 0);
    }

    public static double fahrenheitToCelcius(double fahrenheit) {
        double celsius = celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static double celciusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
}

