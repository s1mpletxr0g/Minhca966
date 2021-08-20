package ss17_io_binary_file.bai_tap.copy_file_nhi_phan;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyFile {
    public static void OutputStream(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" moi nhap vao duong dan toi fi can copy");
        String input = scanner.nextLine();
        System.out.println(" moi nhap vao duong dan den file nhan copy");
        String outPut = scanner.nextLine();
        File file = new File(input);
        File file1 = new File(outPut);
        try {
            OutputStream(file, file1);
            System.out.println(" copy file thanh cong");
        } catch (IOException e) {
            System.out.println("copy that bai" + " \n" + "tep nguon khong ton tai");
        }
    }
}
