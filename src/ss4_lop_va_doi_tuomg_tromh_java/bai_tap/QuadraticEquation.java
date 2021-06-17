package ss4_lop_va_doi_tuomg_tromh_java.bai_tap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class QuadraticEquation {
    int a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return b * 2 - 4 * a * c;
    }

    public double getN1() {
        return (-b + Math.pow(b * b - 4 * a * c, 0.5)) / (2 * a);
    }

    public double getN2() {
        return (-b - Math.pow(b * b - 4 * a * c, 0.5)) / (2 * a);
    }

    public void getDenta() {
        if (getDiscriminant() > 0) {
            System.out.println(getN1() + "" + getN2());
        } else if (getDiscriminant() == 0) {
            System.out.println("" + getN1());
        } else {
            System.out.println("The equation has no roots");
        }
    }

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi nhap a");
        a = scanner.nextInt();
        System.out.println("moi nhap b");
        b = scanner.nextInt();
        System.out.println("moi nhap c");
        c = scanner.nextInt();
        QuadraticEquation TimNghiem = new QuadraticEquation(a, b, c);
        TimNghiem.getDenta();

    }
}
