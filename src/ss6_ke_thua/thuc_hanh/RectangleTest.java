package ss6_ke_thua.thuc_hanh;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        System.out.println(rectangle);
        Rectangle rectangle1=new Rectangle(12,16,"red",false);
        System.out.println("chu vi hinh chu nhat="+rectangle1.getPrimeter()+" dien tich="+rectangle1.getArea()+" " +
                " "+ rectangle1.toString());
    }
}
