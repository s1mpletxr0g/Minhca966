package ss7_abstract_class_va_interface.bai_tap.ColorableInterface;

import ss7_abstract_class_va_interface.bai_tap.Circle;
import ss7_abstract_class_va_interface.bai_tap.Rectangle;
import ss7_abstract_class_va_interface.bai_tap.Shape;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("gray", true, 6.0);
        shapes[1] = new Rectangle("green", true, 6.0, 5.0);
        shapes[2] = new Square("red", true, 12.0);
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Square) {
                Square square = (Square) shapes[i];
                square.howToColor();

//                ((Square) shapes[i]).howToColor();
            } else if (shapes[i] instanceof Circle) {
                Circle circle = (Circle) shapes[i];
                System.out.println("dien tich hinh tron " + circle.getArea());
            } else {
                Rectangle rectangle = (Rectangle) shapes[i];
                System.out.println("dien tich hinh chu nhat la: " + rectangle.getArea());
            }
        }
    }
}

