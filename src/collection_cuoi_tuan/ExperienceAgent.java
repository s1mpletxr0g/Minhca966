package collection_cuoi_tuan;

import java.util.ArrayList;
import java.util.Scanner;

public class ExperienceAgent extends Agent{
    private int expInYear;
    private  String proSkill;

    public ExperienceAgent() {
    }

    public ExperienceAgent(int expInYear, String proSkill) {
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public ExperienceAgent(int id, String name, int age, String address, String mail, int expInYear, String proSkill) {
        super(id, name, age, address, mail);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    ArrayList<ExperienceAgent> list1= new ArrayList<>();


    @Override
    public void add() {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" mời nhập id nhân viên");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.println(" mời nhập tên nhân viên ");
        String name=scanner.nextLine();
        System.out.println("mời nhập tuổi nhân viên ");
        int age=Integer.parseInt(scanner.nextLine());
        System.out.println(" mời nhập địa chỉ nhân viên");
        String address=scanner.nextLine();
        System.out.println(" mời nhập đị chỉ mail ");
        String mail=scanner.nextLine();
        int expInYear=Integer.parseInt(scanner.nextLine());
        System.out.println("mời nhập kỹ năng ");
        String proSkill=scanner.nextLine();
        ExperienceAgent experienceAgent=new ExperienceAgent(id,name,age,address,mail,expInYear,proSkill);
        list1.add(experienceAgent);
        for(ExperienceAgent experienceAgent1:list1){
            System.out.println(experienceAgent1);
        }


    }

    @Override
    public void edit() {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" mời nhập stt nhân viên cần sửa ");
        int stt=Integer.parseInt(scanner.nextLine());
        for(int i=0; i<list1.size();i++){
            if(stt==i){
                System.out.println(" mời nhập id nhân viên");
                int id=Integer.parseInt(scanner.nextLine());
                System.out.println(" mời nhập tên nhân viên ");
                String name=scanner.nextLine();
                System.out.println("mời nhập tuổi nhân viên ");
                int age=Integer.parseInt(scanner.nextLine());
                System.out.println(" mời nhập địa chỉ nhân viên");
                String address=scanner.nextLine();
                System.out.println(" mời nhập đị chỉ mail ");
                String mail=scanner.nextLine();
                System.out.println("mời nhập số năm kinh ngiệm ");
                int expInYear=Integer.parseInt(scanner.nextLine());
                System.out.println("mời nhập kỹ năng ");
                String proSkill=scanner.nextLine();
                list1.get(i).setId(id);
                list1.get(i).setName(name);
                list1.get(i).setAge(age);
                list1.get(i).setAddress(address);
                list1.get(i).setMail(mail);
                list1.get(i).setExpInYear(expInYear);
                list1.get(i).setProSkill(proSkill);
                for(ExperienceAgent experienceAgent: list1){
                    System.out.println(experienceAgent);
                }

            }
        }

    }

    @Override
    public void remove() {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" mời nhập stt nhân viên cần xóa ");
        int stt=Integer.parseInt(scanner.nextLine());
        for(int i=0; i<list1.size();i++){
            if(stt==i){
                list1.remove(i);
            }
        }
        for(ExperienceAgent experienceAgent: list1){
            System.out.println(experienceAgent);
        }

    }

    @Override
    public void search() {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" mời nhập stt nhân viên cần tìm ");
        int stt=Integer.parseInt(scanner.nextLine());
        for(int i=0; i<list1.size();i++){
            if(stt==i){
                System.out.println(list1.get(i));
            }
        }
    }

    @Override
    public String toString() {
        return "ExperienceAgent{" + super.toString()+
                " expInYear= " + expInYear +
                " , proSkill= '" + proSkill + '\'' +
                '}';
    }
}
