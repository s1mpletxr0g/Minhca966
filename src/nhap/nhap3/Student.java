package nhap.nhap3;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {
    private String school;
    private  String address;

    public Student() {
    }

    public Student(String name, int age, String school, String address) {
        super(name, age);
        this.school=school;
        this.address=address;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
        return " student "+name+" "+ age+" tuổi "+ " học trường "+ school+" đị chỉ "+address;
    }

    ArrayList<Student> arr=new ArrayList<>();
    @Override
    public   void add() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("moi nhap ten");
        name=scanner.nextLine();
        System.out.println(" moi nhap tuoi");
        age=Integer.parseInt(scanner.nextLine());
        System.out.println("moi nhap truong");
        school=scanner.nextLine();
        System.out.println(" moi nhap dia chi");
        address=scanner.nextLine();
        Student student=new Student(name,age,school,address);
        arr.add(student);
        for(Student student1: arr){
            System.out.println(student1);
        }

    }

    @Override
    public  void edit() {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" moi nhap vao ao id can edit");
        int id=Integer.parseInt(scanner.nextLine());
        boolean flag= true;
        for(int i=0;i<arr.size();i++){
            if(id==i){
                System.out.println(" moi nhap ten");
                name=scanner.nextLine();
                System.out.println(" moi nhap tuoi");
                age=Integer.parseInt(scanner.nextLine());
                System.out.println("moi nhap trường");
                school=scanner.nextLine();
                System.out.println(" moi nhap dia chi");
                address=scanner.nextLine();
                arr.get(i).setName(name);
                arr.get(i).setAge(age);
                arr.get(i).setSchool(school);
                arr.get(i).setAddress(address);
                for(Student student: arr){
                    System.out.println(student);
                }
                flag=true;
                break;
            }


        }
        if(flag=false){
            System.out.println("khong tim thay id trong mang");

        }


    }

    @Override
    public   void delete() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("moi nhap id can deleta");
        int id=scanner.nextInt();
        boolean flag=true;
        for(int i=0;i<arr.size();i++){
            if(id==i){
                arr.remove(i);
                for(Student student: arr){
                    System.out.println(student);
                }
                flag=true;
                break;
            }
        }
        if(false==false){
            System.out.println("khong tim thay id can xoa");
        }

    }
}
