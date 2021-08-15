package nhap.io_file.phuong_thuc_doc_va_coppy_file;

import java.io.*;

public class CoppyFile {
   // độc file:
    public static String readFile(FileReader fileReader){
        int i=0;
        String result=" ";
        try{
            while ((i=fileReader.read())!=-1){
                result += (char)i;
            }
        }catch(IOException e){
            e.printStackTrace();

        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

       return result;
        }

        //ghi file vào file chỉ định:
    public static void writeFile(FileWriter fileWriter, String result){
        try {
            fileWriter.write(result);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    //test thử:
    public static void main(String[] args) {
        File file=new File("D:\\up_git\\ca\\src\\nhap\\io_file\\phuong_thuc_doc_va_coppy_file\\file.txt");
        File file1=new File("D:\\up_git\\ca\\src\\nhap\\io_file\\phuong_thuc_doc_va_coppy_file\\ketqua.txt");
        String result;
        try{
            FileReader fileReader=new FileReader(file);
            FileWriter fileWriter= new FileWriter(file1);
            result=readFile(fileReader);
            writeFile(fileWriter,result);
        }catch (IOException e){
            e.printStackTrace();

        }

    }


    }



