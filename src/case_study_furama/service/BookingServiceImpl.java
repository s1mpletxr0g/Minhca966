package case_study_furama.service;

import case_study_furama.common.WriteAndRead;
import case_study_furama.model.booking.Booking;
import case_study_furama.model.contacts.Contracts;
import case_study_furama.service.impl.BookingService;

import java.sql.SQLOutput;
import java.util.*;

public class BookingServiceImpl extends Booking implements BookingService {

    Set<Booking> listBooking = new TreeSet<>(new BookingComperator());
    public final String FileBooking = "F:\\up_git\\ca\\src\\case_study_furama\\data\\booking.csv";

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" moi nhap idBooking ");
        String idBooking = scanner.nextLine();
        System.out.println(" moi nhap ngay bat dau thue ");
        String firstDay = scanner.nextLine();
        System.out.println(" moi nhap ngay tra phong");
        String endDay = scanner.nextLine();
        System.out.println(" moi nhap idCustomer");
        String idCustomer = scanner.nextLine();
        System.out.println("moi nhap ten khach hang");
        String nameService = scanner.nextLine();
        System.out.println(" moi nhap loai dich vu");
        String typeService = scanner.nextLine();
        Booking booking = new Booking(idBooking, firstDay, endDay, idCustomer, nameService, typeService);
        listBooking.add(booking);
        List<String> list = new ArrayList<>();
        list.add(booking.toString());
        WriteAndRead.writeFile(FileBooking, list, true);


    }

    @Override

    public void edit() {
        List<Booking> listBK = new ArrayList<>(listBooking);
        Scanner scanner = new Scanner(System.in);
        System.out.println(" moi nhap idBooking cua doi tuong can edit");
        String idBooking = scanner.nextLine();
        for (int i = 0; i < listBK.size(); i++) {
            if (listBK.get(i).getIdBooking().contains(idBooking)) {
                System.out.println(" moi nhap idBooking ");
                idBooking = scanner.nextLine();
                System.out.println(" moi nhap ngay bat dau thue ");
                String firstDay = scanner.nextLine();
                System.out.println(" moi nhap ngay tra phong");
                String endDay = scanner.nextLine();
                System.out.println(" moi nhap idCustomer");
                String idCustomer = scanner.nextLine();
                System.out.println("moi nhap ten khach hang");
                String nameService = scanner.nextLine();
                System.out.println(" moi nhap loai dich vu");
                String typeService = scanner.nextLine();
                listBK.get(i).setIdBooking(idBooking);
                ;
                listBK.get(i).setEndDay(firstDay);
                listBK.get(i).setEndDay(endDay);
                listBK.get(i).setIdCustomer(idCustomer);
                listBK.get(i).setNameService(nameService);
                listBK.get(i).setTypeService(typeService);

                WriteAndRead.writeFile(FileBooking,convertListToString(listBK),false);
            }
        }

    }
    public List<String> convertListToString(List<Booking> bookingList) {
        List<String> stringList = new ArrayList<>();
        for (Booking booking : bookingList) {
            stringList.add(booking.toString());
        }
        return stringList;
    }

    @Override
    public void remote() {

    }

    @Override
    public void display() {
        for (Booking bk : listBooking) {
            System.out.println(bk.toString());
        }
    }
    public List<Booking> readListBooking(){
        List<String> stList= WriteAndRead.readFile(FileBooking);
        List<Booking> bookings= new ArrayList<>();
        String [] arr;
        for( String st: stList){
            arr=st.split(",");
            bookings.add(new Booking(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5]));
        }
        return bookings;
    }
}
