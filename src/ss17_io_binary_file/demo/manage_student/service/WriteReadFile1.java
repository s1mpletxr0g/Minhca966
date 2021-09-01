package ss17_io_binary_file.demo.manage_student.service;




import ss17_io_binary_file.demo.manage_student.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteReadFile1 {
    static final String PATH_FILE = "D:\\code_gym\\ca\\C0921G1_HuynhMinhCa_Module2\\src\\" +
            "ss17_io_binary_file\\manage_student\\view\\test.csv";

    public static List<Student> readFile(String fileName) {
        File file = new File(PATH_FILE);
        List<Student> studentList = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            if (fileInputStream.available() != 0) {
                objectInputStream = new ObjectInputStream(fileInputStream);
                // khi mình ghi vào object nào thì cast đúng kiểu của object đó
                studentList = (List<Student>) objectInputStream.readObject();
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return studentList;
    }

    public static void writeFile(List<Student> studentList) {
        File file = new File(PATH_FILE);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(studentList);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try{
                if (objectOutputStream != null){
                    objectOutputStream.close();
                }
                if (fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
