package case_study_furama.service;

import case_study_furama.model.person.Customer;
import case_study_furama.service.impl.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    static List<Customer> list= new LinkedList<>();
    static {
        list.add(new Customer("1", "ca", 1996, "nam",
                " 206001637", "0823202011", "0823202011", " daimond",
                " Quang Nam"));
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
        System.out.println(" moi nhap loai khach hang");
        String rankCustomer=scanner.nextLine();
        System.out.println(" moi nhap dia chi khach hang ");
        String address=scanner.nextLine();
        Customer customer= new Customer(id, name, birthDay, gender, idCard,phone, mail,rankCustomer,address);
        list.add(customer);
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
            System.out.println(customer);
        }

    }
}
