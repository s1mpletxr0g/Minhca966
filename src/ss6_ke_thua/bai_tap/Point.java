package ss6_ke_thua.bai_tap;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class Point {
    private float x;
    private float y;
    protected Point(){

    }
    public Point(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }
    public float[] getXy(){
        float[]Arr={this.x,this.y};
        return Arr;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXy(float x,float y){
        float[]Arr={this.x,this.y};
        System.out.println(this.x+"."+this.y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
