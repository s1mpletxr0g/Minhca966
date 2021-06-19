package ss5_access_modifier_static_method.thuc_hanh;

public class TestStaticProperty {
    public static void main(String[] args) {
        LopCar Car1=new LopCar("Mazda 3","Skyactiv 3");
        System.out.println(LopCar.numberOfCars);
        LopCar Car2=new LopCar("Mazda 6","Skyactiv 6");
        System.out.println(LopCar.numberOfCars);

    }
}
