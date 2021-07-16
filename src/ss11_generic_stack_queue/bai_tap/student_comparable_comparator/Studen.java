package ss11_generic_stack_queue.bai_tap.student_comparable_comparator;

class Student implements Comparable<Student>{
    private String name;
    private int age;
    private  String iddress;

    public Student(String name, int age, String iddress) {
        this.name = name;
        this.age = age;
        this.iddress = iddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIddress() {
        return iddress;
    }

    public void setIddress(String iddress) {
        this.iddress = iddress;
    }

    @Override
    public int compareTo(Student o) {
        if(this.name.compareTo(o.name)==0){
            return this.age-o.age;
        }else{
            return this.name.compareTo(o.name);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", iddress='" + iddress + '\'' +
                '}';
    }
}
