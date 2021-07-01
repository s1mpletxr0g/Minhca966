package ss6_ke_thua.bai_tap;

import java.lang.reflect.Array;

public class Point2D {
    private int x;
    private int y;
    protected Point2D(){
    }
    public Point2D(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
    public void getXy(){
        System.out.print("Array of"+"["+x+"]"+"["+y+"]");
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setXy(int x,int y){
        System.out.println("Array of"+"["+x+"]"+"["+y+"]");
    }

    public String toString() {
        return
                "x=" + x +
                ", y=" + y +", "
                ;
    }
}
