//package ss17_io_binary_file.demo.manage_student.service.impl;
//
//
//import ss17_io_binary_file.demo.manage_student.model.Student;
//import ss17_io_binary_file.demo.manage_student.service.IStudentService;
//import ss17_io_binary_file.demo.manage_student.service.WriteReadFile;
//
//import java.util.List;
//import java.util.Scanner;
//
//public class StudentService implements IStudentService {
//
//    List<Student> students ;
//    {
//        students = WriteReadFile.readFile(FILE_NAME);
//    }
//
//    @Override
//    public void addStudent() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter name");
//        String name = scanner.nextLine();
//        System.out.println("Please enter gender");
//        String gender = scanner.nextLine();
//        System.out.println("Please enter age");
//        int age = Integer.parseInt(scanner.nextLine());
//        System.out.println("Please enter point");
//        double point = Double.parseDouble(scanner.nextLine());
//        students.add(new Student(name, age, gender, point));
//        WriteReadFile.writeFile(students);
//    }
//
//    @Override
//    public void displayStudent() {
//        students = WriteReadFile.readFile(FILE_NAME);
//        for (Student student: students) {
//            System.out.println(student);
//        }
//    }
//
//    @Override
//    public void deleteStudent() {
//
//    }
//}
