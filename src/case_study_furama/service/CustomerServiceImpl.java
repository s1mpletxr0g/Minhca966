package case_study_furama.service;

import case_study_furama.common.WriteAndRead;
import case_study_furama.model.person.Customer;
import case_study_furama.service.impl.CustomerService;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomerServiceImpl implements CustomerService {

    public  final  String FiLe="F:\\up_git\\ca\\src\\case_study_furama\\data\\customer.csv";
    static List<Customer> listCustomer=new LinkedList<>();
    Scanner scanner = new Scanner(System.in);
    String id;
    String name;
    String birthDay;
    String gender;
    String idCard;
    String phone;
    String mail;
    String rankCustomer;
    String address;

    @Override
    public void add() {
        while (true){
            try {
                System.out.println(" moi nhap id nhan vien");
                id = scanner.nextLine();
                break;
            }catch (Exception e){
                System.err.println(" định dạn id nhập vào không đúng");
            }
        }
        while (true){
            try{
                System.out.println(" moi nhap ten nhan vien");
                name = scanner.nextLine();
                break;
            }catch (Exception e){
                System.err.println(" dinh dang ten nhap vao khong dung");
            }
        }
        while (true){
            try{
                System.out.println(" moi nhap ngay sinh nhan vien");
               String birthDay = scanner.nextLine();
               Pattern pattern= Pattern.compile("^(0[1-9]|12[0-9]|3[01])/(0[1-9]|1[0-2])/[1921-2004]$");
               break;
            }catch (Exception e){
                System.out.println("");
            }
        }



        System.out.println(" moi nhap gioi tinh");
         gender = scanner.nextLine();
        System.out.println(" moi nhap cmnd");
        idCard = scanner.nextLine();
        System.out.println(" moi nhap phone");
        phone = scanner.nextLine();
        System.out.println("moi nhap gmail");
        mail = scanner.nextLine();
        System.out.println(" moi nhap loai khach hang");
        rankCustomer = scanner.nextLine();
        System.out.println(" moi nhap dia chi khach hang ");
        address = scanner.nextLine();
        Customer customer = new Customer(id, name, birthDay, gender, idCard, phone, mail, rankCustomer, address);
        listCustomer.add(customer);
        List<String> listString= new LinkedList<>();

        listString.add(customer.toString());
//        listString.add(customer.getId()+","+customer.getName()+","+customer.getGender()+","+ customer.getIdCard()+","
//        +customer.getPhone()+","+customer.getMail()+","+customer.getRankCustomer()+","+customer.getAddress());
//neu toString lop cha chua dung fomar thi ghi ra chi tiet;
        WriteAndRead.writeFile(FiLe,listString,true);
    }
    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" moi nhap vao id muon edit ");
        String id = scanner.nextLine();
        for (int i = 0; i < listCustomer.size(); i++) {
            if (listCustomer.get(i).getId().contains(id)) {

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
                System.out.println(" moi nhap loai khach hang");
                String rankCustomer = scanner.nextLine();
                System.out.println(" moi nhap dia chi khach hang ");
                String address = scanner.nextLine();
                listCustomer.get(i).setId(id);
                listCustomer.get(i).setName(name);
                listCustomer.get(i).setBirthday(birthDay);
                listCustomer.get(i).setGender(gender);
                listCustomer.get(i).setIdCard(idCard);
                listCustomer.get(i).setPhone(phone);
                listCustomer.get(i).setMail(mail);
                listCustomer.get(i).setRankCustomer(rankCustomer);
                listCustomer.get(i).setAddress(address);


            }
        }

    }

    @Override
    public void remote() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" moi nhap id nhan vien muon delete");
        String id = scanner.nextLine();
        for (int i = 0; i < listCustomer.size(); i++) {
            if (listCustomer.get(i).getId().toLowerCase().contains(id)) {
                listCustomer.remove(i);
            }
        }

    }

    @Override
    public void display() {
        for (Customer customer : listCustomer) {
            System.out.println(customer);
        }

    }

    public List<Customer> readlistCustomer(){
        List<String> listString = WriteAndRead.readFile(FiLe);
        List<Customer> listCustomer = new LinkedList<>();
        String [] customer ;
        for (String a : listString) {
            customer = a.split(",");
            listCustomer.add(new Customer(customer[0],customer[1],customer[2],customer[3],
                    customer[4],customer[5],customer[6],customer[7],customer[8]));
        }
        return listCustomer;

    }

}






