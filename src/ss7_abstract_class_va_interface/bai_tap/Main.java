package ss7_abstract_class_va_interface.bai_tap;

public class Main {
    public static void main(String[] args) {
        Shape [] shapes=new Shape[3];
        shapes[0]=new Circle("blue", true, 5.0);
        shapes[1]=new Rectangle("black", false,3.4,5.6);
        shapes[2]=new Square("green", true,4.0);
        for(Shape shape: shapes){
            if(shape instanceof Circle){
                Circle circle = (Circle) shape;
                System.out.println("before"+ circle.getArea());
                circle.resize( Math.random()*99+1);
                System.out.println(circle.getArea());
            }

        }
    }
}
