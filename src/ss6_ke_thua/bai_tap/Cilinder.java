package ss6_ke_thua.bai_tap;

public class Cilinder extends CircleAndCilinder{
    private float height;
    protected Cilinder(){

    }
    public Cilinder(float radius,float height){
        super(radius);
        this.height=height;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPrimeter() {
        return super.getPrimeter()*height;
    }

    @Override
    public String toString() {
        return " Cilinder{" +
                " height= " + height +
                " Area= "+getArea()+
                " primeter= "+getPrimeter()+
                '}';
    }
}
