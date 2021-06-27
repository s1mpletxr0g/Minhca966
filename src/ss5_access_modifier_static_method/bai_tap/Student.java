package ss5_access_modifier_static_method.bai_tap;

public class Student {
    private String name="John";
    private String classes="C02";
    public Student(){

    }
    protected Student(String name,String classer){
        this.name=name;
        this.classes=classes;
    }
    public String getName(){
        return this.name;
    }
    public String getClasses(){
        return this.classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
