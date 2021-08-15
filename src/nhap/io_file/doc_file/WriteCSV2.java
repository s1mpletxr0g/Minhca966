package nhap.io_file.doc_file;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class WriteCSV2 {
    public static void main(String[] args) {

       File file=new File("D:\\up_git\\ca\\src\\nhap\\nhap4\\doc_file\\country.csv");
        try {
            List<String> list=Files.readAllLines(file.toPath(),StandardCharsets.UTF_8);
            for( String line: list){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
