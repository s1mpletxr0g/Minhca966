package ss6_ke_thua.thuc_hanh;

public class Rectangle extends Shape {
    private float width;
    private  float length;
    protected Rectangle(){

    }
    protected Rectangle(float width, float length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(float width, float length, String color, boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }
    public float getWidth(){
        return this.width;
    }

    public float getLength() {
        return length;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }
    public double getArea(){
        return width*length;
    }
    public double getPrimeter(){
        return width+length;
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", which is a subclass of "
                + super.toString();

    }
}
