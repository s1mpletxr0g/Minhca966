package collection_cuoi_tuan;

import java.util.ArrayList;
import java.util.Scanner;

public class Fresher extends Agent {
    private int graduationDate;
    private String graduationRank;

    public Fresher() {
    }

    public Fresher(int graduationDate, String graduationRank) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
    }

    public Fresher(int id, String name, int age, String address, String mail, int graduationDate, String graduationRank) {
        super(id, name, age, address, mail);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
    }

    public int getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(int graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

     ArrayList<Fresher> list2 = new ArrayList<>();

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" mời nhập id nhân viên");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println(" mời nhập tên nhân viên ");
        String name = scanner.nextLine();
        System.out.println("mời nhập tuổi nhân viên ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println(" mời nhập địa chỉ nhân viên");
        String address = scanner.nextLine();
        System.out.println(" mời nhập đị chỉ mail ");
        String mail = scanner.nextLine();
        System.out.println(" mời nhập số năm ra trường ");
        int graduationDate = Integer.parseInt(scanner.nextLine());
        System.out.println("mời nhập loại bằng tốt ghiệp ");
        String graduationRank = scanner.nextLine();
        Fresher fresher = new Fresher(id, name, age, address, mail, graduationDate, graduationRank);
        list2.add(fresher);
        for (Fresher fresher1 : list2) {
            System.out.println(fresher1);
        }

    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" mời nhập stt nhân viên cần sửa ");
        int stt = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < list2.size(); i++) {
            if (stt == i) {
                System.out.println(" mời nhập id nhân viên");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println(" mời nhập tên nhân viên ");
                String name = scanner.nextLine();
                System.out.println("mời nhập tuổi nhân viên ");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println(" mời nhập địa chỉ nhân viên");
                String address = scanner.nextLine();
                System.out.println(" mời nhập đị chỉ mail ");
                String mail = scanner.nextLine();
                System.out.println(" mời nhập số năm đã ra trường");
                int graduationDate = Integer.parseInt(scanner.nextLine());
                System.out.println("mời nhập loại bằng tốt nghiệp ");
                String graduationRank;
                graduationRank = scanner.nextLine();
                list2.get(i).setId(id);
                list2.get(i).setName(name);
                list2.get(i).setAge(age);
                list2.get(i).setAddress(address);
                list2.get(i).setMail(mail);
                list2.get(i).setGraduationDate(graduationDate);
                list2.get(i).setGraduationRank(graduationRank);
                for (Fresher fresher : list2) {
                    System.out.println(fresher);
                }

            }
        }

    }

    @Override
    public void remove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" mời nhập stt nhân viên cần sửa ");
        int stt = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < list2.size(); i++) {
            if (stt == i) {
                list2.remove(i);
            }
        }
        for (Fresher fresher : list2) {
            System.out.println(fresher);
        }
    }

    @Override
    public void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" mời nhập stt nhân viên cần sửa ");
        int stt = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < list2.size(); i++) {
            if (stt == i) {
                System.out.println(list2.get(i));
            }
        }

    }
    @Override
    public void writeFile() {

    }

    @Override
    public void readFile() {

    }

    @Override
    public String toString() {
        return "Fresher{" + super.toString() +
                "graduationDate=" + graduationDate +
                ", graduationRank='" + graduationRank + '\'' +
                '}';
    }

}
