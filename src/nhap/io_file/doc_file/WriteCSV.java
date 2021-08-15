package nhap.io_file.doc_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class WriteCSV {
    public static void main(String[] args) {


    File file=new File("D:\\up_git\\ca\\src\\nhap\\nhap4\\doc_file\\country.csv");
    BufferedReader bufferedReader=null;
        String line=null;

    {
        try {

            bufferedReader = Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8);
            while (true){
                line=bufferedReader.readLine();
                if(line==null){
                    break;
                }else {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    }
}
