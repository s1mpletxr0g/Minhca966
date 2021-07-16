package nhap3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student Student = new Student();
        System.out.println("Nhập 1 để thêm sinh viên");
        System.out.println("Nhập 2 để thêm edit ");
        System.out.println("Nhập 3 để thêm delete");
        System.out.println("Nhập 4 để thoát");
        Scanner scanner=new Scanner(System.in);
        int choise;
        do{
            System.out.println("mời chọn thao tác");
            choise=scanner.nextInt();
            switch (choise){
                case 1:
                    Student.add();
                    break;
                case 2:
                    Student.edit();
                    break;
                case 3:
                    Student.delete();
                    break;
                case 4:
                default:
            }

        }while (choise!=4);
    }
}
