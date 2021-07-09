package ss6_ke_thua.bai_tap;

import java.util.Scanner;

class MovablePoint extends Point {
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;

    public MovablePoint() {

    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
       super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {

        float[] arr = {this.xSpeed, this.ySpeed};
        return arr;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

    }

    @Override
    public String toString() {
        return super.toString() + "," + "speed" + "=" + "(" + xSpeed + "," + ySpeed + ")";
    }
    public MovablePoint move(){
        x+= xSpeed;
       y+=ySpeed;
       return this;
    }
}
