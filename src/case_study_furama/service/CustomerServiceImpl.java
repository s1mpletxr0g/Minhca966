package case_study_furama.service;

import case_study_furama.common.WriteAndRead;
import case_study_furama.model.person.Customer;
import case_study_furama.service.impl.CustomerService;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
     List<Customer> list= new LinkedList<>();
    public static  final  String FILE_NAME = "case_study_furama\\data\\customer.csv";
{
    list = covertStringToEmployee();
}


    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();
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
        System.out.println(" moi nhap loai khach hang");
        String rankCustomer=scanner.nextLine();
        System.out.println(" moi nhap dia chi khach hang ");
        String address=scanner.nextLine();
        Customer customer= new Customer(id, name, birthDay, gender, idCard,phone, mail,rankCustomer,address);
        list.add(customer);


        stringList.add(customer.toString());
        WriteAndRead.writeFile(FILE_NAME, stringList, true);
    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" moi nhap vao id muon edit ");
        String id= scanner.nextLine();
        for( int i=0; i<list.size(); i++){
            if(list.get(i).getId().contains(id)){
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
                System.out.println(" moi nhap loai khach hang");
                String rankCustomer=scanner.nextLine();
                System.out.println(" moi nhap dia chi khach hang ");
                String address=scanner.nextLine();
                list.get(i).setId(id);
                list.get(i).setName(name);
                list.get(i).setBirthday(birthDay);
                list.get(i).setGender(gender);
                list.get(i).setIdCard(idCard);
                list.get(i).setPhone(phone);
                list.get(i).setMail(mail);
                list.get(i).setRankCustomer(rankCustomer);
                list.get(i).setAddress(address);


                List<String> stringList = covertEmployeeToString();
                WriteAndRead.writeFile(FILE_NAME, stringList, false);
            }
        }

    }

    @Override
    public void remote() {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" moi nhap id nhan vien muon delete");
        String id= scanner.nextLine();
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getId().toLowerCase().contains(id)){
                list.remove(i);
            }
        }

    }

    @Override
    public void display() {
        for( Customer customer: list){
            System.out.println(customer.toString());
        }

    }


    public List<Customer> covertStringToEmployee() {
        List<String> stringList = WriteAndRead.readFile(FILE_NAME);
        List<Customer> customers1 = new LinkedList<>();
        String[] arrCustomer;
        for (String line : stringList) {
            arrCustomer = line.split(",");
            customers1.add(new Customer(arrCustomer[0], arrCustomer[1], Integer.parseInt(arrCustomer[2]),
                    arrCustomer[3], arrCustomer[4], arrCustomer[5], arrCustomer[6],arrCustomer[7],arrCustomer[8]));
        }

        return customers1;
    }

    public List<String> covertEmployeeToString() {
        List<String> listString = new LinkedList<>();
        for (Customer customer : list) {
            listString.add(customer.toString());
        }
        return listString;
    }
}
