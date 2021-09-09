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


    static List<Employee> list = new ArrayList<>();
    public final String FILE = "F:\\up_git\\ca\\src\\case_study_furama\\data\\employee.CSV";

    static {
        list.add(new Employee("1", " minh ca", "01/02/1996", "nam", "206001637", "0823202011", "huynhminhca191", " dai hoc", "quan ly", 15000));
    }


    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" moi nhap id nhan vien");
        String id = scanner.nextLine();
        System.out.println(" moi nhap ten nhan vien");
        String name = scanner.nextLine();
        System.out.println(" moi nhap ngay sinh nhan vien");
       String birthDay = scanner.nextLine();
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
        Employee employee = new Employee(id, name, birthDay, gender, idCard, phone, mail, level, position, salary);
        list.add(employee);
        List<String> listString = new LinkedList<>();
        listString.add(employee.toString());
        WriteAndRead.writeFile(FILE, listString, true);

    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" moi nhap id nhan vien can tim");
        String id = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().contains(id)) {
                System.out.println(" moi nhap thong tin moi cua nhan vien");
                System.out.println(" moi nhap id nhan vien");
                id = scanner.nextLine();
                System.out.println(" moi nhap ten nhan vien");
                String name = scanner.nextLine();
                System.out.println(" moi nhap ngay sinh nhan vien");
                String birthDay = scanner.nextLine();
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
        Scanner scanner = new Scanner(System.in);
        System.out.println(" moi nhap nhan vien can remove qua id");
        String id = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().toLowerCase().contains(id)) {
                list.remove(i);
            }
        }

    }

    @Override
    public void display() {
        for (Employee a : list) {
            System.out.println(a);
        }

    }

    public List<Employee> readlistEmployee() {
        List<String> listString = WriteAndRead.readFile(FILE);
        List<Employee> listEly = new LinkedList<>();
        String[] employee;
        for (String emp : listString) {
            employee = emp.split(",");
            listEly.add(new Employee(employee[0], employee[1], employee[2], employee[3], employee[4], employee[5], employee[6], employee[7], employee[8], Integer.parseInt(employee[9])));
        }
        return listEly;
    }
    }
