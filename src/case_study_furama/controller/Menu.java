package case_study_furama.controller;

import case_study_furama.service.CustomerServiceImpl;
import case_study_furama.service.EmployeeServiceImpl;
import case_study_furama.service.FacilityServiceimpl;

import java.util.Scanner;

public class Menu {
    public void displayMainMenu() {
        FacilityServiceimpl facilityServiceimpl = new FacilityServiceimpl();
        CustomerServiceImpl customerService= new CustomerServiceImpl();
        EmployeeServiceImpl employeeService= new EmployeeServiceImpl();

        int choise;
        do {
            System.out.println(
                            "1.\tEmployee Management\n" +
                            "2.\tCustomer Management\n" +
                            "3.\tFacility Management \n" +
                            "4.\tBooking Management\n" +
                            "5.\tPromotion Management\n" +
                            "6.\tExit\n");
            Scanner scanner = new Scanner(System.in);
            choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1:
                    int choise1;
                    do {
                        System.out.println("" +
                                "1\tDisplay list employees\n" +
                                "2\tAdd new employee\n" +
                                "3\tEdit employee\n" +
                                "4\tReturn main menu\n");
                        choise1 = Integer.parseInt(scanner.nextLine());
                        switch (choise1) {
                            case 1:
                                System.out.println(" \"1\\tDisplay list employees\\n\"");
                                employeeService.display();
                                break;
                            case 2:
                                System.out.println("2\tAdd new employee\n");
                                employeeService.add();
                                break;
                            case 3:
                                System.out.println("3\tEdit employee\n");
                                employeeService.edit();
                                break;
                        }
                    } while (choise1 != 4);
                    break;
                case 2:
                    int choise2;
                    do {
                        System.out.println(
                                "1.\tDisplay list customers\n" +
                                        "2.\tAdd new customer\n" +
                                        "3.\tEdit customer\n" +
                                        "4.\tReturn main menu\n");
                        choise2 = Integer.parseInt(scanner.nextLine());
                        switch (choise2) {
                            case 1:
                                System.out.println("1.\tDisplay list customers\n");
                                customerService.display();
                                break;
                            case 2:
                                System.out.println("3.\tEdit customer\n");
                                customerService.add();
                                break;
                            case 3:
                                System.out.println("3.\tEdit customer\n");
                                customerService.edit();
                                break;
                        }
                    } while (choise2 != 4);
                    break;
                case 3:
                    int choise3;
                    do {
                        System.out.println(
                                "1\tDisplay list facility\n" +
                                        "2\tAdd new facility\n" +
                                        "3\tDisplay list facility maintenance\n" +
                                        "4\tReturn main menu\n");
                        choise3 = Integer.parseInt(scanner.nextLine());
                        switch (choise3) {
                            case 1:
                                System.out.println(
                                        "1.displayroom" +"\n"
                                        +" 2.displayhouse"+" \n"+
                                        "3.displayVilla"+" \n"+
                                        " 4.exit");


                                break;
                            case 2:
                                facilityServiceimpl.addRoom();
                                break;
                            case 3:
                                System.out.println("3\tDisplay list facility maintenance\n");
                                break;
                        }
                    } while (choise3 != 4);
                    break;
                case 4:
                    int choise4;
                    do {
                        System.out.println(
                                "1.\tAdd new booking\n" +
                                        "2.\tDisplay list booking\n" +
                                        "3.\tCreate new constracts\n" +
                                        "4.\tDisplay list contracts\n" +
                                        "5.\tEdit contracts\n" +
                                        "6.\tReturn main menu\n");
                        choise4 = Integer.parseInt(scanner.nextLine());
                        switch (choise4) {
                            case 1:
                                System.out.println("\"1.\\tAdd new booking\\n\"");
                                break;
                            case 2:
                                System.out.println("2.\tDisplay list booking\n");
                                break;
                            case 3:
                                System.out.println("3.\tCreate new constracts\n");
                                break;
                            case 4:
                                System.out.println("4.\tDisplay list contracts\n");
                                break;
                            case 5:
                                System.out.println("5.\tEdit contracts\n");
                                break;
                        }
                    } while (choise4 != 6);
                    break;
                case 5:
                    int choise5;
                    do {
                        System.out.println(
                                "1.\tDisplay list customers use service\n" +
                                        "2.\tDisplay list customers get voucher\n" +
                                        "3.\tReturn main menu\n");
                        choise5 = Integer.parseInt(scanner.nextLine());
                        switch (choise5) {
                            case 1:
                                System.out.println("1.\tDisplay list customers use service\n");
                                break;
                            case 2:
                                System.out.println("2.\tDisplay list customers get voucher\n");
                                break;
                        }
                    } while (choise5 != 3);
            }

        } while (choise != 6);
    }
}
