package nhap.nhap4.ghi_tu_ban_phim_vao_file;


import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class write {
  public static void  writeCSV(List<Country> list) throws IOException{
      File file=new File("D:\\up_git\\ca\\src\\nhap\\nhap4\\ghi_tu_ban_phim_vao_file\\text.CSV");
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
          } catch (IOException e) {
              e.printStackTrace();
          }
          try {
              bufferedWriter.close();
          } catch (IOException e) {
              e.printStackTrace();
          }
      }
  }

    public static void main(String[] args) {
        List<Country> list=new ArrayList<>();
        list.add(new Country(1,"Việt Nam","Vn"));
        list.add(new Country(1,"Lào","L"));
        list.add(new Country(1,"Thailand","TL"));
        try {
            writeCSV(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
