package ss6_ke_thua.thuc_hanh;

import java.sql.SQLOutput;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle(12, "origin", true);
        System.out.println(circle1);
        Circle circle2 = new Circle();
        Circle circle3 = new Circle(15, "pink", false);
        System.out.println(circle3.getRadius() + "  " + circle3.getArea() + "  " + circle3.getprimeter());

    }
}
