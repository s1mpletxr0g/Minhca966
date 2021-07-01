package ss6_ke_thua.bai_tap;

public class Triangle extends Shape {
    private double slide2;
    private double slide3;
    protected Triangle(){

    }
    public Triangle(double slide1, double slide2, double slide3){
        super(slide1);
        this.slide2=slide2;
        this.slide3=slide3;
    }

    @Override
    public double getSlide1() {
        return super.getSlide1();
    }

    public double getSlide2() {
        return slide2;
    }

    public double getSlide3() {
        return slide3;
    }

    @Override
    public double getArea() {
        double p=0.5*(getSlide1()+getSlide2()+getSlide3());
        return Math.pow(p*(p-this.getSlide1())*(p-this.getSlide2())*(p-this.getSlide3()),2);
    }

    @Override
    public double getPrimeter() {
        return super.getPrimeter()+getSlide2()+getSlide3();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                " slide2= " + slide2 +
                ", slide3= " + slide3 +", "+
                super.toString()
                ;
    }
}
