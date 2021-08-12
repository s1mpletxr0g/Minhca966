package ss16_io_text_file.demo.b16_io_text_file;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriterCSV {
    public static final String PATH_SOURCE_FILE = "D:\\up_git\\ca\\src\\ss16_io_text_file\\demo\\b16_io_text_file\\write.csv";

//    public static List<Country> readCSV(List<Country> countries) {
//        List<Country> countryList = new ArrayList<>();
//        BufferedReader bufferedReader = null;
//        File file = new File(PATH_SOURCE_FILE);
//        try {
//            FileReader fileReader = new FileReader(file);
//            bufferedReader = new BufferedReader(fileReader);
//            String line;
//            String[] temp;
//            Country country;
//            while ((line = bufferedReader.readLine()) != null){
//                temp = line.split(",");
//                country = new Country(Integer.parseInt(temp[0]), temp[1], temp[2]);
//                countryList.add(country);
//            }
//        } catch (FileNotFoundException fileNotFoundException) {
//            fileNotFoundException.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                bufferedReader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        return countryList;
//    }

//    public static void writeCSV(List<Country> countryList) throws IOException {
//        BufferedWriter bufferedWriter = null;
//        File file = new File(PATH_SOURCE_FILE);
//        try {
//            FileWriter fileWriter = new FileWriter(file);
//            bufferedWriter = new BufferedWriter(fileWriter);
//           for (Country country : countryList){
//               bufferedWriter.append(country.toString()+"\n");
////               bufferedWriter.newLine();
//           }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            bufferedWriter.flush();
//            bufferedWriter.close();
//        }
//    }
//
//    public static void main(String[] args) {
//        List<Country> countries = new ArrayList<>();
//        countries.add(new Country(1, "Australia", "AU"));
//        countries.add(new Country(2, "China", "CN"));
//        countries.add(new Country(3, "Japan", "JP"));
//        try {
//            writeCSV(countries);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

public static void writeCSV(List<Country> countryList)throws IOException{
   File file=new File(PATH_SOURCE_FILE);
   BufferedWriter bufferedWriter = null;

    {
        try {
            bufferedWriter = Files.newBufferedWriter(file.toPath(), StandardCharsets.UTF_8);
            for(Country country: countryList){
                bufferedWriter.append(country.toString()+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}

    public static void main(String[] args) {
        List<Country> countryList=new ArrayList<>();
        countryList.add(new Country(1, "Quảng Nam", " Việt Nam "));
        countryList.add(new Country(2, " Đà Nẵng ", " Việt Nam "));
        countryList.add(new Country(3," Quảng Ngãi", "Việt Nam"));
        try {
            writeCSV(countryList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
