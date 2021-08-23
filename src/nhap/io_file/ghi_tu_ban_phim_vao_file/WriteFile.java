package nhap.io_file.ghi_tu_ban_phim_vao_file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
// phương thức viết file lên link:
public class WriteFile {
    public  static void writeFile(List< Country> list)throws IOException{
        File file= new File("D:\\up_git\\ca\\src\\nhap\\io_file\\ghi_tu_ban_phim_vao_file\\text.CSV");
        BufferedWriter bufferedWriter=null;

        try {
            bufferedWriter= Files.newBufferedWriter(file.toPath(), StandardCharsets.UTF_8);
            for( Country country: list){
                bufferedWriter.append(country.toString()+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.flush();
                bufferedWriter.close();
            }catch ( IOException e){
                e.printStackTrace();

            }

        }

    }
    //test:
    public static void main(String[] args) {
        List< Country> list= new ArrayList<>();
        list.add(new Country(1," viet nam"," vn"));
        list.add(new Country(2," lào","l"));
        try {
            writeFile(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
