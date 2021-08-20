package nhap.io_binary_file.chep_file_co_san;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    public  static  void copyBinary(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" mời nhập file gốc");
        String input=scanner.nextLine();
        System.out.println(" mòi nhập file copy");
        String output=scanner.nextLine();
        File file=new File(input);
        File file1= new File(output);
        try {
            copyBinary(file,file1);
            System.out.println(" cop file thành công");
        } catch (IOException e) {
            System.out.println(" copy file thất bại ");
        }
    }

}
