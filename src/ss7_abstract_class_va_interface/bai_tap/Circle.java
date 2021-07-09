package ss7_abstract_class_va_interface.bai_tap;

public class Circle extends Shape implements Resizeable{
    private double radius=1.0;
    protected Circle(){

    }
    public Circle(String color, boolean filled, double radius){
        super(color,filled);
        this.radius=radius;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    public double getPerimeter(){
        return getRadius()*2*Math.PI;
    }

    @Override
    public String toString() {
        return  "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
       setRadius(getRadius()*Math.sqrt((100+percent)/100));

    }
}
