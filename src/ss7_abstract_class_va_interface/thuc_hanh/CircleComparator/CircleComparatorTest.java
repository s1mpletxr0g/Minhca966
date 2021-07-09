package ss7_abstract_class_va_interface.thuc_hanh.CircleComparator;

import ss6_ke_thua.thuc_hanh.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    private static Object CircleComparator;

    public static void main(String[] args) {
        Circle[] circles=new Circle[3];
        circles[0]=new Circle();
        circles[1]=new Circle(2.3);
        circles[2]=new Circle(4.5,"green",false);
        System.out.println("Pre-sorted:");
        for( Circle circle: circles){
            System.out.println(circle);
        }
        Comparator circleComparator=new CircleComparator();
        Arrays.sort(circles,circleComparator);

        for(Circle circle: circles){
            System.out.println(circle);
        }
    }
}
