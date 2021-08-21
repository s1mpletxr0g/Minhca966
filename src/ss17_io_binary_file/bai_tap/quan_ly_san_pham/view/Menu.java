package ss17_io_binary_file.bai_tap.quan_ly_san_pham.view;


import ss17_io_binary_file.bai_tap.quan_ly_san_pham.model.Product;
import ss17_io_binary_file.bai_tap.quan_ly_san_pham.service.ProductService;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    ProductService productService= new ProductService();
    public void menu() {
        int choice;
        while (true) {
            System.out.println("Please choice:\n" +
                    "1. Add \n" +
                    "2. Display \n" +
                    "3. search \n "+
                    "4. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    productService.add();
                    break;
                case 2:
                   productService .display();
                    break;
                case 3:
                    productService.search();
                case 4:
                default:
            }
        }
    }
}
