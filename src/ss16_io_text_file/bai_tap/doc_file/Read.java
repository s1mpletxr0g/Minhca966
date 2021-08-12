package ss16_io_text_file.bai_tap.doc_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Read {
    public static void main(String[] args) {
//        File file = new File("D:\\up_git\\ca\\src\\ss16_io_text_file\\bai_tap\\doc_file\\country.csv");


//        try {
//            BufferedReader rd = Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8);
//            String line = null;
//            while (true) {
//                line = rd.readLine();
//                if (line==null){
//                    break;
//                }else{
//                    System.out.println(line);
//                }
//            } }
//        catch(IOException e){
//                e.printStackTrace();
//            }

File file=new File("D:\\up_git\\ca\\src\\ss16_io_text_file\\bai_tap\\doc_file\\country.csv");
        try {
            List<String> rd= Files.readAllLines(file.toPath(),StandardCharsets.UTF_8);
            for( String line: rd){
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
