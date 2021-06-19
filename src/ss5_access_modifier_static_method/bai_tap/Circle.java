package ss5_access_modifier_static_method.bai_tap;

public class Circle {
    private int radius=1;
    private String color="blue";
    public Circle(){

    }
protected Circle(int radius){
        this.radius=radius;

}

    public int getRadius() {
        return this.radius;
    }

    public double getArea()
{
        return getRadius()*getRadius()*Math.PI;
}

    public String getColor() {
        return color="black";
    }

    public static void main(String[] args) {
        Circle O=new Circle(6);
        System.out.println("ban kinh hinh tron " + O.getRadius()+" dien tic la "+ O.getArea()+ " mau "+ O.getColor());
    }
}


