package ss12_map.thuc_hanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapStudent {
    public static void hashMapListSV(){
        Map<String,Integer> danhSach=new HashMap<>();
        danhSach.put("Nguyễn Thị Hoa", 30);
        danhSach.put("Huỳnh Minh Ca",25);
        danhSach.put("Lê Văn Tài", 20);
        System.out.println(" danh sách sinh viên và độ tuổi");
        System.out.println(danhSach);
    }
    public static void treeMap(){
        Map<String, Integer> danhSach=new TreeMap<>();
        danhSach.put("Nguyễn Thị Hoa", 30);
        danhSach.put("Huỳnh Minh Ca",25);
        danhSach.put("Lê Văn Tài", 20);
        System.out.println(" danh sách sinh viên và độ tuổi");
        System.out.println(danhSach);
    }
    public static void leckedHaskMap(){
        Map<String, Integer> danhsach=new LinkedHashMap<>();
        danhsach.put("Nguyễn Thị Hoa", 30);
        danhsach.put("Huỳnh Minh ca", 25);
        danhsach.put("Lê Văn Tài",20);
        System.out.println(" danh sách sinh viên và độ tuổi");
        System.out.println(danhsach);
        System.out.println(" độ tuổi của sinh viên Nguyễn Thị Hoa");
        System.out.println(danhsach.get("Nguyễn Thị Hoa"));
    }

    public static void main(String[] args) {
        hashMapListSV();
        System.out.println("//");
        treeMap();
        System.out.println("//");
        leckedHaskMap();
    }
}
