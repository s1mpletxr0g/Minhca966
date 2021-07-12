package ss1_Introduction_to_Java.nhap_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Cat> arr = new ArrayList<>();

    public static void addCat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mèo ăn gì");
        String eat = scanner.nextLine();
        System.out.println("đi đâu");
        String go = scanner.nextLine();
        System.out.println("săn con gì");
        String hunt = scanner.nextLine();
        Cat s = new Cat(eat, go, hunt);
        arr.add(s);
        for (Cat cat : arr) {
            System.out.println(cat);
        }
    }

    public static void editCat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời nhập id cần edit");
        int id = Integer.parseInt(scanner.nextLine());
        boolean timThay = false;
        for (int i = 0; i < arr.size(); i++) {
            if (id == i) {
                System.out.println("mời nhập thức ăn mới");
                String eat = scanner.nextLine();
                System.out.println("mời nhập thời gian đi");
                String go = scanner.nextLine();
                System.out.println("mời nhập con mồi mới");
                String hunt = scanner.nextLine();
                arr.get(i).setEat(eat);
                arr.get(i).setGo(go);
                arr.get(i).setHunt(hunt);
                for (Cat cat : arr) {
                    System.out.println(cat);
                }
                timThay = true;
                break;
            }

        }

        if (timThay = false) {
            System.out.println("không tìm thấy vị trí của mèo");
        }
    }

    public static void deletaCat() {
        Scanner scanner = new Scanner(System.in);
        int d;
        System.out.println("mời nhập id cần xóa");
        int id = scanner.nextInt();
        boolean timThay = false;
        for (int i = 0; i < arr.size(); i++) {
            if (id == i) {
                d = i;
                arr.remove(d);
                for (Cat cat : arr) {
                    System.out.println(cat);
                }
                timThay = true;
                break;
            }
        }
        if (timThay = false) {
            System.out.println("không tìm thấy mèo");
        }

    }

    public static void main(String[] args) {
        System.out.println("Mèo 1");
        addCat();
        System.out.println("Mèo 2");
        addCat();
        System.out.println("Sửa thông tin mèo");
        editCat();
        System.out.println("xóa mèo");
        deletaCat();

    }
}
