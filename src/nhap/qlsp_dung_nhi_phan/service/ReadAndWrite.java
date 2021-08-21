package nhap.qlsp_dung_nhi_phan.service;

import nhap.qlsp_dung_nhi_phan.model.Product;

import javax.tools.FileObject;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {

    public static final String PATH_FILE="D:\\code_gym\\ca\\C0921G1_HuynhMinhCa_Module2\\src\\nhap\\qlsp_dung_nhi_phan\\view\\test.csv";
   public static List<Product> readFile(){
       List<Product> list= new ArrayList<>();

       File file= new File(PATH_FILE);
       FileInputStream fileInputStream=null;
       ObjectInputStream objectInputStream= null;
       try{
           fileInputStream= new FileInputStream(file);
           if(fileInputStream.available()!=0){
               objectInputStream= new ObjectInputStream(fileInputStream);
               list= (List<Product>) objectInputStream.readObject();
           }


       }catch (FileNotFoundException e){

       } catch (IOException e) {
           e.printStackTrace();
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }finally {
           try{
               if(fileInputStream!=null){
                   fileInputStream.close();
               }
               if( objectInputStream!=null){
                   objectInputStream.close();
               }

               } catch (IOException e) {
               e.printStackTrace();
           }

       }
       return list;
   }
   public  static void writeFile(List<Product> list){
       File file = new File(PATH_FILE);
       FileOutputStream fileOutputStream=null;
       ObjectOutputStream objectOutputStream= null;
       try {
           fileOutputStream= new FileOutputStream(file);
          objectOutputStream= new ObjectOutputStream(fileOutputStream);
           objectOutputStream.writeObject(list);
       }catch (FileNotFoundException e){
           System.out.println(" file ko tồn tại");
       } catch (IOException e) {
           e.printStackTrace();
       }finally {


       }


   }
}

