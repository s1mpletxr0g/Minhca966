package case_study_furama.service;


import case_study_furama.common.WriteAndRead;
import case_study_furama.model.contacts.Contracts;
import case_study_furama.service.impl.ContractService;
import javafx.scene.effect.SepiaTone;

import java.util.*;

public class ContractsServiceImpl extends Contracts implements ContractService {
    public final String fileContracts = "F:\\up_git\\ca\\src\\case_study_furama\\data\\contract.csv";
    Scanner scanner = new Scanner(System.in);
    Set<Contracts> listContracts = new TreeSet<>(new ContracstComparator());

    @Override
    public void add() {

        System.out.println(" moi nhap numContracts");
        String numContracts = scanner.nextLine();
        System.out.println(" moi nhap idBooking");
        String idBooking = scanner.nextLine();
        System.out.println(" moi nhap tien coc ");
        int deposit = Integer.parseInt(scanner.nextLine());
        System.out.println("moi nhap tien tong");
        int sumMoney = Integer.parseInt(scanner.nextLine());
        System.out.println(" moi nhap idCustomer");
        String idCustomer = scanner.nextLine();
        Contracts contracts = new Contracts(numContracts, idBooking, deposit, sumMoney, idCustomer);
        listContracts.add(contracts);
        List<String> list = new ArrayList<>();
        list.add(contracts.toString());
        WriteAndRead.writeFile(fileContracts, list, true);

    }

    @Override
    public void edit() {
        List<Contracts> list1 = new ArrayList<>(listContracts);
        System.out.println(" moi nhap idBooking cuar dich vu can edit");
        String idBooking = scanner.nextLine();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).getIdBooking().contains(idBooking)) {
                System.out.println(" moi nhap numContracts");
                String numContracts = scanner.nextLine();
                System.out.println(" moi nhap idBooking");
                idBooking = scanner.nextLine();
                System.out.println(" moi nhap tien coc ");
                int deposit = Integer.parseInt(scanner.nextLine());
                System.out.println("moi nhap tien tong");
                int sumMoney = Integer.parseInt(scanner.nextLine());
                System.out.println(" moi nhap idCustomer");
                String idCustomer = scanner.nextLine();
                list1.get(i).setNumContracts(numContracts);
                list1.get(i).setIdBooking(idBooking);
                list1.get(i).setDeposit(deposit);
                list1.get(i).setSumMoney(sumMoney);
                list1.get(i).setIdCustomer(idCustomer);


            }
            WriteAndRead.writeFile(fileContracts, convertListToString(list1), false);
        }


    }

    public List<String> convertListToString(List<Contracts> contractsList) {
        List<String> stringList = new ArrayList<>();
        for (Contracts contracts : contractsList) {
            stringList.add(contracts.toString());
        }
        return stringList;
    }


    @Override
    public void remote() {

    }

    @Override
    public void display() {
        for (Contracts contracts : listContracts) {
            System.out.println(contracts.toString());
        }

    }

    public List<Contracts> readList() {
        List<String> list = WriteAndRead.readFile(fileContracts);
        List<Contracts> contracts = new ArrayList<>();
        String[] arr;
        for (String st : list) {
            arr = st.split(",");
            contracts.add(new Contracts(arr[0], arr[1], Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4]));
        }
        return contracts;

    }


}
