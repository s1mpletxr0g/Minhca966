package police_streets;

import java.util.ArrayList;
import java.util.Scanner;

public class XeTai extends XeMay {
    public XeTai() {
    }

    public XeTai(String bKS, String tenHang, int namSX, String chuSoHuu, String soChoNgoi, String trongTai, String congSuat) {
        super(bKS, tenHang, namSX, chuSoHuu, soChoNgoi, trongTai, congSuat);
    }



    @Override
    public String toString() {
        return " bKS,"+getbKS()+" tenHang, "+ getTenHang()+" namSX,"+ getNamSX()+" chuSoHuu, "+
                getChuSoHuu()+ " soChoNgoi, "+getSoChoNgoi()+" trongTai,"+getTrongTai()+" congSuat "+getCongSuat();
    }



    ArrayList<XeMay> arr2 = new ArrayList<>();


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
        arr2.add(xeMay);
        for (XeMay xeMay1 : arr2) {
            System.out.println(xeMay1);
        }

    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" mời nhập id xe cần edit ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag=true;
        for (int i = 0; i < arr2.size(); i++) {
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
                arr2.get(i).setbKS(bKS);
                arr2.get(i).setTenHang(tenHang);
                arr2.get(i).setNamSX(namXS);
                arr2.get(i).setChuSoHuu(chuSoHuu);
                arr2.get(i).setSoChoNgoi(soChoNgoi);
                arr2.get(i).setTrongTai(trongTai);
                arr2.get(i).setCongSuat(congSuat);
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
        for( int i=0; i<arr2.size();i++){
            if(id==i){
                arr2.remove(i);
                for(XeMay xeMay: arr2)
                    System.out.println(xeMay);
            }
        }

    }
}
