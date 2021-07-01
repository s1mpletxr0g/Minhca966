package ss6_ke_thua.bai_tap;

public class Shape {
    private double slide1=1.0;
    protected Shape(){

    }
    public Shape(double slide1){
        this.slide1=slide1;
    }

    public double getSlide1() {
        return slide1;
    }
    public double getArea(){
        return this.slide1;
    }
    public double getPrimeter(){
        return this.slide1;
    }
    public void setSlide1(double slide1) {
        this.slide1 = slide1;
    }
    public void setArea(double slide1){
        this.slide1=slide1;
    }
    public void setPrimeter(double slide1){
        this.slide1=slide1;
    }

    @Override
    public String toString() {
        return
                " slide1= " + slide1 +
                '}'+", Area= "+getArea()+", Primeter= "+ getPrimeter();
    }
}

