package ss1_Introduction_to_Java.nhap;

public class Engineer extends Person {
    private String build;
    protected Engineer(){

    }
    public Engineer(String build){
        this.build=build;
    }
    public Engineer(String name,int age,String build){
        super(name, age);
        this.build=build;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "build='" + build + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void add() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
