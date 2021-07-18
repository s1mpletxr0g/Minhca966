package cong_an_giao_thong_den;

import java.util.ArrayList;
import java.util.Scanner;

public class XeMay extends PoliceStriss {
    private String soChoNgoi;
    private String trongTai;
    private String congSuat;

    public XeMay() {
    }

    public XeMay(String bKS, String tenHang, int namSX, String chuSoHuu, String soChoNgoi, String trongTai, String congSuat) {
        super(bKS, tenHang, namSX, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.trongTai = trongTai;
        this.congSuat = congSuat;
    }


    public String getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(String soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(String trongTai) {
        this.trongTai = trongTai;
    }

    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }


    @Override
    public String toString() {
        return " bKS: " + getbKS() + ", tenHang: " + getTenHang() + ", namSX: " + getNamSX() + ", chuSoHuu: " +
                getChuSoHuu() + ", soChoNgoi: " + getSoChoNgoi() + ", trongTai: " + getTrongTai() + ", congSuat: " + getCongSuat();
    }


    ArrayList<XeMay> arr1 = new ArrayList<>();


    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập bks");
        String bKS = scanner.nextLine();
        System.out.println("moi nhập hãng xe");
        String tenHang = scanner.nextLine();
        System.out.println("mời nhập năm sản xuất");
        int namXS = Integer.parseInt(scanner.nextLine());
        System.out.println(" mời nhập chủ sở hữu");
        String chuSoHuu = scanner.nextLine();
        System.out.println(" mời nhập số chổ ngồi của xe");
        String soChoNgoi = scanner.nextLine();
        System.out.println(" mời nhập trọng tải xe");
        String trongTai = scanner.nextLine();
        System.out.println("mời nhập công suất");
        String congSuat = scanner.nextLine();
        XeMay xeMay = new XeMay(bKS, tenHang, namXS, chuSoHuu, soChoNgoi, trongTai, congSuat);
        arr1.add(xeMay);
        for (XeMay xeMay1 : arr1) {
            System.out.println(xeMay1);
        }

    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" mời nhập id xe cần edit ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag=true;
        for (int i = 0; i < arr1.size(); i++) {
            if (id == i) {
                System.out.println("Mời nhập bks");
                String bKS = scanner.nextLine();
                System.out.println("moi nhập hãng xe");
                String tenHang = scanner.nextLine();
                System.out.println("mời nhập năm sản xuất");
                int namXS = Integer.parseInt(scanner.nextLine());
                System.out.println(" mời nhập chủ sở hữu");
                String chuSoHuu = scanner.nextLine();
                System.out.println(" mời nhập số chổ ngồi của xe");
                String soChoNgoi = scanner.nextLine();
                System.out.println(" mời nhập trọng tải xe");
                String trongTai = scanner.nextLine();
                System.out.println("mời nhập công suất");
                String congSuat = scanner.nextLine();
                arr1.get(i).setbKS(bKS);
                arr1.get(i).setTenHang(tenHang);
                arr1.get(i).setNamSX(namXS);
                arr1.get(i).setChuSoHuu(chuSoHuu);
                arr1.get(i).setSoChoNgoi(soChoNgoi);
                arr1.get(i).setTrongTai(trongTai);
                arr1.get(i).setCongSuat(congSuat);
                for(XeMay xeMay: arr1){
                    System.out.println(xeMay);
                }
                flag=true;
                break;

            }
        }
        if(flag==false){
            System.out.println("id vị trí xe không đúng");
        }

    }

    @Override
    public void delete() {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" mời nhập vào id vị trí xe muốn xóa");
        int id=scanner.nextInt();
        for( int i=0; i<arr1.size();i++){
            if(id==i){
                arr1.remove(i);
                for(XeMay xeMay: arr1)
                System.out.println(xeMay);
            }
        }

    }
}
