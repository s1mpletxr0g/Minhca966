package collection_cuoi_tuan;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExperienceAgent experienceAgent = new ExperienceAgent();
        Fresher fresher = new Fresher();
        PracticeStudent practiceStudent = new PracticeStudent();
        int choise;
        do {
            System.out.println("MENU");
            System.out.println("choise 1: tương tác với ExperienceAgent");
            System.out.println("choise 2: tương tác với Fresher");
            System.out.println("choise 3: tương tác với PracticeStudent");
            System.out.println("choise 4: exit");
            Scanner scanner = new Scanner(System.in);
            choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    int choise1;
                    do {
                        System.out.println(" MENU ExperienceAgent");
                        System.out.println("choise 1: add ExperienceAgent");
                        System.out.println("choise 2: edit ExperienceAgent");
                        System.out.println("choise 3: remove ExperienceAgent");
                        System.out.println("choise 4: search ExperienceAgent");
                        System.out.println("choise 5: Exit ExperienceAgent");

                        choise1 = scanner.nextInt();
                        switch (choise1) {
                            case 1:
                                experienceAgent.add();
                                break;
                            case 2:
                                experienceAgent.edit();
                                break;
                            case 3:
                                experienceAgent.remove();
                                break;
                            case 4:
                                experienceAgent.search();
                                break;

                        }
                    } while (choise1 != 5);
                    break;
                case 2:
                    int choise2;
                    do {
                        System.out.println("MENU  Fresher ");
                        System.out.println("choise 1: add  Fresher");
                        System.out.println("choise 2: edit  Fresher");
                        System.out.println("choise 3: remove  Fresher");
                        System.out.println("choise 4: search  Fresher");
                        System.out.println("choise 5: Exit Fresher");
                        choise2 = scanner.nextInt();
                        switch (choise2) {
                            case 1:
                                fresher.add();
                            case 2:
                                fresher.edit();
                            case 3:
                                fresher.remove();
                            case 4:
                                fresher.search();

                        }
                    } while (choise2 != 5);
                    break;
                case 3:
                    int choise3;
                    do{
                    System.out.println("MENU PracticeStudent ");
                    System.out.println("choise 1: add  PracticeStudent");
                    System.out.println("choise 2: edit PracticeStudent");
                    System.out.println("choise 3: remove  PracticeStudent");
                    System.out.println("choise 4: search  PracticeStudent");
                    System.out.println("choise 5: Exit  PracticeStudent");
                   choise3 = scanner.nextInt();
                    switch (choise3) {
                        case 1:
                            practiceStudent.add();
                        case 2:
                            practiceStudent.edit();
                        case 3:
                            practiceStudent.remove();
                        case 4:
                            practiceStudent.search();
                    }
                    }while (choise3!=5);
                    break;

            }
        } while (choise != 4);

    }

}
