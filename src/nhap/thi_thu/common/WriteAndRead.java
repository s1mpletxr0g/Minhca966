package case_study_furama.common;

import case_study_furama.model.contacts.Contracts;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndRead {
    public static void writeFile(String path, List<String> stringList, boolean append) {
        File file = new File(path);
        BufferedWriter bw = null;
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            bw = new BufferedWriter(fileWriter);
            for (String line : stringList) {
                bw.write((line));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.flush();
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static List<String> readFile(String path) {
        List<String> stringList = new ArrayList<>();
        File file = new File(path);
        BufferedReader br = null;
        try {
            FileReader fileReader = new FileReader(file);
            br = new BufferedReader(fileReader);
            String line = "";
            while ((line = br.readLine()) != null) {
                stringList.add(line);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (br != null){
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return stringList;
    }
    //phuong thuc chuyen doi doi tuong sang string de update
    public List<String> convertListToStringdemo(List<Contracts> contractsList) {
        List<String> stringList = new ArrayList<>();
        for (Contracts contracts : contractsList) {
            stringList.add(contracts.toString());
        }
        return stringList;
    }

}
