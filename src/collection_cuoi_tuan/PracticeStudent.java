package collection_cuoi_tuan;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeStudent extends Agent {
    private String  majors;
    private int semester;
    private String universityName;

    public PracticeStudent() {
    }



    public PracticeStudent(String majors, int semester, String universityName) {
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public PracticeStudent(int id, String name, int age, String address, String mail, String majors, int semester, String universityName) {
        super(id, name, age, address, mail);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    ArrayList<PracticeStudent> list3= new ArrayList<>();

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" mời nhập id thực tập viên");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println(" mời nhập tên thực tập viên ");
        String name = scanner.nextLine();
        System.out.println("mời nhập tuổi thực tập viên ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println(" mời nhập địa chỉ thực tập viên");
        String address = scanner.nextLine();
        System.out.println(" mời nhập đị chỉ mail thực tập viên ");
        String mail = scanner.nextLine();
        System.out.println(" mời nhập chuyên ngành thực tập viên");
        String majors=scanner.nextLine();
        System.out.println("mời nhập học kỳ của thực tập viên");
        int semester = Integer.parseInt(scanner.nextLine());
        System.out.println(" mời nhập tên trường của thực tập viên");
        String universityName=scanner.nextLine();
        PracticeStudent practiceStudent = new PracticeStudent(id, name, age, address, mail, majors, semester, universityName);
        list3.add(practiceStudent);
        for (PracticeStudent practiceStudent1 : list3) {
            System.out.println(practiceStudent1);
        }

    }

    @Override
    public void edit() {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" mời nhập vào stt của thực tập viên cần edit");
        int stt=scanner.nextInt();
        for(int i=0;i<list3.size();i++){
            if(stt==i){
                System.out.println(" mời nhập id thực tập viên");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println(" mời nhập tên thực tập viên ");
                String name = scanner.nextLine();
                System.out.println("mời nhập tuổi thực tập viên ");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println(" mời nhập địa chỉ thực tập viên");
                String address = scanner.nextLine();
                System.out.println(" mời nhập đị chỉ mail thực tập viên");
                String mail = scanner.nextLine();
                System.out.println(" mời nhập chuyên ngành của thực tập viên ");
                String majors=scanner.nextLine();
                System.out.println("mời nhập học kỳ của thực tập viên");
                int semester = Integer.parseInt(scanner.nextLine());
                System.out.println(" mời nhập tên trường của thực tập viên");
                String universityName=scanner.nextLine();
                list3.get(i).setId(id);
                list3.get(i).setName(name);
                list3.get(i).setAge(age);
                list3.get(i).setAddress(address);
                list3.get(i).setMail(mail);
                list3.get(i).setMajors(majors);
                list3.get(i).setSemester(semester);
                list3.get(i).setUniversityName(universityName);
                for( PracticeStudent practiceStudent: list3){
                    System.out.println(practiceStudent);
                }

            }
        }

    }

    @Override
    public void remove() {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" mời nhập stt thực tập viên cần xóa");
        int stt=scanner.nextInt();
        for (int i=0;i<list3.size();i++){
            if(stt==i){
                list3.remove(i);
            }
        }
        for(PracticeStudent practiceStudent: list3){
            System.out.println(practiceStudent);
        }

    }

    @Override
    public void search() {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" mời nhập stt thực tập viên cần xóa");
        int stt=scanner.nextInt();
        for (int i=0;i<list3.size();i++){
            if(stt==i){
                System.out.println(list3.get(i));
            }
        }

    }

    @Override
    public String toString() {
        return "PracticeStudent{ " +super.toString()+
                " majors=' " + majors + '\'' +
                " , semester= " + semester +
                " , universityName=' " + universityName + '\'' +
                '}';
    }
}
