package ss7_abstract_class_va_interface.thuc_hanh.Circle;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircles=new ComparableCircle[3];
        comparableCircles[0]= new ComparableCircle();
        comparableCircles[1]=new ComparableCircle(2.4);
        comparableCircles[2]=new ComparableCircle(4.6,"blue",true);
        System.out.println("Pre-sorted");
        for( ComparableCircle circle:comparableCircles){
            System.out.println(circle);
        }
        Arrays.sort(comparableCircles);
        for(ComparableCircle circle: comparableCircles){
            System.out.println(circle);
        }

    }
}
