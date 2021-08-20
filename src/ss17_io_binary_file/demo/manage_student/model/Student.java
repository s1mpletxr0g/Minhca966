package ss17_io_binary_file.demo.manage_student.model;

public class Student extends Person{
    static final long serialVersionUID = 8937341502050489502l;
    static private double point;
    private ClassName className;
    public Student(double point) {
        this.point = point;
    }

    public Student(String name, int age, String gender, double point) {
        super(name, age, gender);
        this.point = point;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "point=" + point +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
