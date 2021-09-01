package case_study_furama.service;

import case_study_furama.common.WriteAndRead;
import case_study_furama.model.person.Customer;
import case_study_furama.model.person.Employee;
import case_study_furama.service.impl.EmployeeService;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    {
        list = covertStringToEmployee();
    }
   static List<Employee> list = new ArrayList<>();
   public static final String FILE_NAME="F:\\up_git\\ca\\src\\case_study_furama\\data\\employee.CSV";
   static {
       list.add(new Employee("1", " minh ca", 1996, "nam", "206001637","0823202011","huynhminhca191"," dai hoc","quan ly",15000));
   }
   @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" moi nhap id nhan vien");
        String id = scanner.nextLine();
        System.out.println(" moi nhap ten nhan vien");
        String name = scanner.nextLine();
        System.out.println(" moi nhap ngay sinh nhan vien");
        int birthDay = Integer.parseInt(scanner.nextLine());
        System.out.println(" moi nhap gioi tinh");
        String gender = scanner.nextLine();
        System.out.println(" moi nhap cmnd");
        String idCard = scanner.nextLine();
        System.out.println(" moi nhap phone");
        String phone = scanner.nextLine();
        System.out.println("moi nhap gmail");
        String mail = scanner.nextLine();
        System.out.println(" moi nhap hoc van");
        String level = scanner.nextLine();
        System.out.println(" moi nhap chuc vu nhan vien");
        String position = scanner.nextLine();
        System.out.println(" moi nhap luong nhan vien");
        int salary = Integer.parseInt(scanner.nextLine());
        Employee e = new Employee(id, name, birthDay, gender, idCard, phone, mail, level, position, salary);
        list.add(e);


    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" moi nhap id nhan vien can tim");
        String id = scanner.nextLine();
        for (int i=0; i<list.size();i++) {
            if (list.get(i).getId().contains(id)) {
                System.out.println(" moi nhap thong tin moi cua nhan vien");
                    System.out.println(" moi nhap id nhan vien");
                    id = scanner.nextLine();
                    System.out.println(" moi nhap ten nhan vien");
                    String name = scanner.nextLine();
                    System.out.println(" moi nhap ngay sinh nhan vien");
                    int birthDay = Integer.parseInt(scanner.nextLine());
                    System.out.println(" moi nhap gioi tinh");
                    String gender = scanner.nextLine();
                    System.out.println(" moi nhap cmnd");
                    String idCard = scanner.nextLine();
                    System.out.println(" moi nhap phone");
                    String phone = scanner.nextLine();
                    System.out.println("moi nhap gmail");
                    String mail = scanner.nextLine();
                    System.out.println(" moi nhap hoc van");
                    String level = scanner.nextLine();
                    System.out.println(" moi nhap chuc vu nhan vien");
                    String position = scanner.nextLine();
                    System.out.println(" moi nhap luong nhan vien");
                    int salary = Integer.parseInt(scanner.nextLine());
                    list.get(i).setId(id);
                    list.get(i).setName(name);
                    list.get(i).setBirthday(birthDay);
                    list.get(i).setGender(gender);
                    list.get(i).setIdCard(idCard);
                    list.get(i).setPhone(phone);
                    list.get(i).setMail(mail);
                    list.get(i).setLevel(level);
                    list.get(i).setPosition(position);
                    list.get(i).setSalary(salary);
            }
            }
        }



    @Override
    public void remote() {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" moi nhap nhan vien can remove qua id");
        String id=scanner.nextLine();
        for(int i=0; i<list.size(); i++){
            if( list.get(i).getId().toLowerCase().contains(id)){
                list.remove(i);
            }
        }

    }

    @Override
    public void display() {
        for (Employee employee : list) {
            System.out.println(employee.toString());
        }

    }
    public List<Employee> covertStringToEmployee() {
        List<String> stringList = WriteAndRead.readFile(FILE_NAME);
        List<Employee> employee1 = new LinkedList<>();
        String[] arrEmployee;
        for (String line : stringList) {
            arrEmployee = line.split(",");
            employee1.add(new Employee(arrEmployee[0], arrEmployee[1], Integer.parseInt(arrEmployee[2]),
                    arrEmployee[3], arrEmployee[4], arrEmployee[5], arrEmployee[6],arrEmployee[7],arrEmployee[8],Integer.parseInt(arrEmployee[8])));
        }

        return employee1;
    }
    public List<String> Write() {
        List<String> listString = new LinkedList<>();
        for (Employee employee : list) {
            listString.add(employee.toString());
        }
        return listString;
    }
}
