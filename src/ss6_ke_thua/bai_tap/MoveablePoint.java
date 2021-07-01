package ss6_ke_thua.bai_tap;

import java.util.Scanner;

public class MoveablePoint extends Point {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float xspeed;
        float yspeed;
        System.out.println("moi nhap xspeed");
        xspeed=scanner.nextFloat();
        System.out.println("moi nhap yspeed");
        yspeed=scanner.nextFloat();
        Point MoveablePoint=new Point(xspeed,yspeed);
        System.out.println(MoveablePoint.getXy()+"  "+ MoveablePoint.toString());
    }
}
