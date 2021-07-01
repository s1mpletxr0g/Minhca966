package ss6_ke_thua.bai_tap;

public class CircleAndCilinder {
    private float radius;
    protected CircleAndCilinder(){

    }
    public CircleAndCilinder(float radius){
        this.radius=radius;
    }

    public float getRadius() {
        return this.radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPrimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "CircleAndCilinder{" +
                " radius= " + radius +
                " Area= "+ getArea()+
                " primeter= "+ getPrimeter()+
                '}';
    }
}
