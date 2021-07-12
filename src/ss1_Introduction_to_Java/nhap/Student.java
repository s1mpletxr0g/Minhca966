package ss1_Introduction_to_Java.nhap;

public class Student extends Person {
    private double point;
    protected Student(){
    }
    public Student(double point){
        this.point=point;
    }
    public Student(String name,int age,double point){
        super(name, age);
        this.point=point;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
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
        return "Student{" +
                "point=" + point +
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
