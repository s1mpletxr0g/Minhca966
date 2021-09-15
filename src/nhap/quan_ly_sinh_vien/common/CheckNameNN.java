package nhap.quan_ly_sinh_vien.common;

import nhap.quan_ly_sinh_vien.models.Student;
import nhap.quan_ly_sinh_vien.models.StudentNN;

import java.util.List;
import java.util.Scanner;

public class Check {
    public void check(List<StudentNN> list, String name){
        Scanner scanner= new Scanner(System.in);
        System.out.println(" moi nhap ten  cua sinh vien can xoa");
        for(int i=0; i<list.size();i++){
            if(list.get(i).getName().equals(name)){

                System.out.println(" chon 1: xoa luon va ngay");
                System.out.println(" thoi de lai");
                int choise=Integer.parseInt(scanner.nextLine());
                switch (choise){
                    case 1:
                        list.remove(i);
                    case 2:
                        break;
                }
            }
        }

    }
}
