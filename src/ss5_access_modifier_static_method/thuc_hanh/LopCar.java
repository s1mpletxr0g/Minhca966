package ss5_access_modifier_static_method.thuc_hanh;

public class LopCar {
    private String name;
    private String engine;
    public static int numberOfCars;
    public LopCar(String name,String engine ){
        this.name=name;
        this.engine=engine;
        numberOfCars++;
    }

}
