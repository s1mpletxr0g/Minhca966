package ss6_ke_thua.thuc_hanh;

public class Circle extends Shape {
    private double radius=1;
    public Circle(){

    }
    public Circle(double radius){

    }
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getprimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setFilled(boolean pilled) {
        super.setFilled(pilled);
    }

    @Override
    public String toString() {
         return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
