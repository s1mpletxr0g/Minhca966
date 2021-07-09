package ss6_ke_thua.bai_tap;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint=new MovablePoint(2,5,7,8);

        System.out.println(movablePoint.move());
        Point point=new Point(2,5);
        System.out.println(point.toString());
    }
}
