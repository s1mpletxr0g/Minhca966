package ss1_Introduction_to_Java.nhap;

public class Doctor extends Person {
    private String time;
    protected Doctor(){

    }
    public Doctor(String time){
        this.time=time;
    }
    public Doctor(String name,int age, String time){
        super(name,age);
        this.time=time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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
        return "Doctor{" +
                "time='" + time + '\'' +
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
