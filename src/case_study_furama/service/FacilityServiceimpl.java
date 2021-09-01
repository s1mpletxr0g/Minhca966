package case_study_furama.service;

import case_study_furama.model.facility.Facility;
import case_study_furama.model.facility.House;
import case_study_furama.model.facility.Room;
import case_study_furama.model.facility.Vila;
import case_study_furama.service.impl.FacilityService;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FacilityServiceimpl implements FacilityService {
    String idService;
    Scanner scanner = new Scanner(System.in);
    static Map<Room, Integer> mapRoom = new LinkedHashMap<>();

    static {
        mapRoom.put(new Room("SVRO", "phong 1", 20.0, 500, 3, " ngay", "chich"), 1);
    }

    @Override
    public void addRoom() {


        while (true) {
            try {
                System.out.println(" moi nhap idService");
                idService = scanner.nextLine();
                Pattern pattern = Pattern.compile("^(SVRO-)(\\d){4}$");
                Matcher m = pattern.matcher(idService);
                if (!m.matches()) {
                    throw new IllegalArgumentException();
                }
                break;
            } catch (IllegalArgumentException e) {
                System.err.println(" sai định dạng");
                System.out.println(" moi nhap lai idService ");
            }
        }
        System.out.println(" moi nhap ten dich vu");
        String nameService = scanner.nextLine();
        System.out.println(" moi nhap dien tich");
        double area = Integer.parseInt(scanner.nextLine());
        System.out.println(" moi nhap gia");
        int spend = Integer.parseInt(scanner.nextLine());
        System.out.println(" moi nhap so nguoi");
        int numberPeople = Integer.parseInt(scanner.nextLine());
        System.out.println(" moi nhap kieu thue");
        String styleEngage = scanner.nextLine();
        System.out.println(" moi nhap dich vu mien phi");
        String freeService = scanner.nextLine();
        mapRoom.put(new Room(idService, nameService, area, spend, numberPeople, styleEngage, freeService), 1);

        for (Map.Entry<Room, Integer> sss : mapRoom.entrySet()) {
            System.out.println(sss);
        }
    }

    @Override
    public void editRoom() {
        System.out.println(" moi ten phong muon xoa ");
        String nameService = scanner.nextLine();
        for (Map.Entry<Room, Integer> mapss : mapRoom.entrySet()) {
            if (mapss.getKey().getNameService().toLowerCase().equals(nameService)) {
                System.out.println(" moi nhap ten dich vu");
                mapss.getKey().setNameService(scanner.nextLine());
                System.out.println(" moi nhap dien tich");
                mapss.getKey().setArea(Integer.parseInt(scanner.nextLine()));
                System.out.println(" moi nhap gia");
                mapss.getKey().setSpend(Integer.parseInt(scanner.nextLine()));
                System.out.println(" moi nhap so nguoi");
                mapss.getKey().setNumberPeople(Integer.parseInt(scanner.nextLine()));
                System.out.println(" moi nhap kieu thue");
                mapss.getKey().setStyleEngage(scanner.nextLine());
                System.out.println(" moi nhap dich vu mien phi");
                mapss.getKey().setFreeService(scanner.nextLine());
                for (Map.Entry<Room, Integer> sss : mapRoom.entrySet()) {
                    System.out.println(sss);
                }
            }
        }


    }

    @Override
    public void remoteRoom() {
        System.out.println(" moi nhap ten phong muon xoa");
        String nameRoom = scanner.nextLine();
        for (Map.Entry<Room, Integer> map : mapRoom.entrySet()) {
            if (map.getKey().getNameService().toLowerCase().equals(nameRoom)) {
                mapRoom.remove(map.getKey());
            }
        }

    }

    @Override
    public void displayRoom() {
        for (Map.Entry<Room, Integer> map : mapRoom.entrySet()) {
            System.out.println(map.toString());
        }

    }

    static Map<House, Integer> mapHouse = new LinkedHashMap<>();

    static {
        mapHouse.put(new House("SVHO", "phong 1", 20.0, 500, 3, " ngay", "vip", 4), 1);
    }

    @Override
    public void addHouse() {
        while (true) {
            try {
                System.out.println(" moi nhap idService");
                idService = scanner.nextLine();
                Pattern pattern = Pattern.compile("^(SVHO-)(\\d){4}$");
                Matcher m = pattern.matcher(idService);
                if (!m.matches()) {
                    throw new IllegalArgumentException();
                }
                break;
            } catch (IllegalArgumentException e) {
                System.err.println(" sai định dạng");
                System.out.println(" moi nhap lai idService ");
            }
        }
        System.out.println(" moi nhap ten dich vu");
        String nameService = scanner.nextLine();
        System.out.println(" moi nhap dien tich");
        double area = Integer.parseInt(scanner.nextLine());
        System.out.println(" moi nhap gia");
        int spend = Integer.parseInt(scanner.nextLine());
        System.out.println(" moi nhap so nguoi");
        int numberPeople = Integer.parseInt(scanner.nextLine());
        System.out.println(" moi nhap kieu thue");
        String styleEngage = scanner.nextLine();
        System.out.println(" moi nhap loai phong");
        String rankRoom = scanner.nextLine();
        System.out.println(" moi nhap tang thue");
        int numFloors = Integer.parseInt(scanner.nextLine());
        mapHouse.put(new House(idService, nameService, area, spend, numberPeople, styleEngage, rankRoom, numFloors), 1);
    }

    @Override
    public void editHouse() {

        System.out.println(" moi nhap nameHouse muon edit");
        String nameHouse = scanner.nextLine();
        for (Map.Entry<House, Integer> map : mapHouse.entrySet()) {
            if (map.getKey().getNameService().toLowerCase().equals(nameHouse)) {
                System.out.println(" moi nhap ten dich vu");
                map.getKey().setNameService(scanner.nextLine());
                System.out.println(" moi nhap dien tich");
                map.getKey().setArea(Integer.parseInt(scanner.nextLine()));
                System.out.println(" moi nhap gia");
                map.getKey().setSpend(Integer.parseInt(scanner.nextLine()));
                System.out.println(" moi nhap so nguoi");
                map.getKey().setNumberPeople(Integer.parseInt(scanner.nextLine()));
                System.out.println(" moi nhap kieu thue");
                map.getKey().setStyleEngage(scanner.nextLine());
                System.out.println(" moi nhap loai phong");
                map.getKey().setRankRoom(scanner.nextLine());
                System.out.println(" moi nhap tang thue");
                map.getKey().setNumFloors(Integer.parseInt(scanner.nextLine()));

            }
        }


    }

    @Override
    public void remoteHouse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" moi nhap nameHouse muon xoa");
        String nameHouse = scanner.nextLine();
        for (Map.Entry<House, Integer> map : mapHouse.entrySet()) {
            if (map.getKey().getNameService().toLowerCase().equals(nameHouse)) {
                mapHouse.remove(nameHouse);
            }
        }

    }

    @Override
    public void displayHouse() {
        for (Map.Entry<House, Integer> map : mapHouse.entrySet()) {
            System.out.println(map.toString());
        }

    }

    static Map<Vila, Integer> mapVila = new LinkedHashMap<>();

    static {
        mapVila.put(new Vila("SVVL-1111", "phong 1", 20.0, 500, 3, " ngay", "vip", 30.0, 4), 1);
    }

    @Override
    public void addVila() {

        while (true) {
            try {
                System.out.println(" moi nhap idService");
                idService = scanner.nextLine();
                Pattern pattern = Pattern.compile("^(SVVL-)(\\d){4}$");
                Matcher m = pattern.matcher(idService);
                if (!m.matches()) {
                    throw new IllegalArgumentException();
                }
                break;
            } catch (IllegalArgumentException e) {
                System.err.println(" sai định dạng");
                System.out.println(" moi nhap lai idService ");
            }
        }
        System.out.println(" moi nhap ten dich vu");
        String nameService = scanner.nextLine();
        Pattern pattern=Pattern.compile("^(A-Z)(a-z){40}$");
        System.out.println(" moi nhap dien tich");
        double area = Integer.parseInt(scanner.nextLine());
        System.out.println(" moi nhap gia");
        int spend = Integer.parseInt(scanner.nextLine());
        System.out.println(" moi nhap so nguoi");
        int numberPeople = Integer.parseInt(scanner.nextLine());
        System.out.println(" moi nhap kieu thue");
        String styleEngage = scanner.nextLine();
        System.out.println(" moi nhap loai phong");
        String rankRoom = scanner.nextLine();
        System.out.println(" moi nhap dien tich ho boi");
        double areaSwim = Integer.parseInt(scanner.nextLine());
        System.out.println(" moi nhap tang thue");
        int numFloors = Integer.parseInt(scanner.nextLine());
        mapVila.put(new Vila(idService, nameService, area, spend, numberPeople, styleEngage, rankRoom, areaSwim, numFloors), 1);

    }

    @Override
    public void editVila() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" moi nhap nameVila muon edit");
        String nameVila = scanner.nextLine();
        for (Map.Entry<Vila, Integer> map : mapVila.entrySet()) {
            if (map.getKey().getNameService().toLowerCase().equals(nameVila)) {
                System.out.println(" moi nhap ten dich vu");
                map.getKey().setNameService(scanner.nextLine());
                System.out.println(" moi nhap dien tich");
                map.getKey().setArea(Integer.parseInt(scanner.nextLine()));
                System.out.println(" moi nhap gia");
                map.getKey().setSpend(Integer.parseInt(scanner.nextLine()));
                System.out.println(" moi nhap so nguoi");
                map.getKey().setNumberPeople(Integer.parseInt(scanner.nextLine()));
                System.out.println(" moi nhap kieu thue");
                map.getKey().setStyleEngage(scanner.nextLine());
                System.out.println(" moi nhap loai phong");
                map.getKey().setRankRoom(scanner.nextLine());
                System.out.println(" moi nhap dien tich ho boi");
                map.getKey().setAreaSwim(Integer.parseInt(scanner.nextLine()));
                System.out.println(" moi nhap tang thue");
                map.getKey().setNumFloors(Integer.parseInt(scanner.nextLine()));
            }
        }


    }

    @Override
    public void remoteVila() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" moi nhap ten vila ca xoa");
        String nameVila = scanner.nextLine();
        for (Map.Entry<Vila, Integer> map : mapVila.entrySet()) {
            if (map.getKey().getNameService().toLowerCase().equals(nameVila)) {
                mapVila.remove(nameVila);
            }
        }

    }

    @Override
    public void displayVila() {
        for (Map.Entry<Vila, Integer> map : mapVila.entrySet()) {
            System.out.println(map.getKey().toString());
        }

    }

    @Override
    public void displayAll() {
        displayRoom();
        System.out.println("*********");
        displayHouse();
        System.out.println("*********");
        displayVila();
    }
}
