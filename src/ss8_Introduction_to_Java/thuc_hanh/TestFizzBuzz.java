package ss8_Introduction_to_Java.thuc_hanh;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestFizzBuzz {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        for (String l : list ){
            System.out.println(l);
        }
//        System.out.println(FizzBuzz.fizzBuzz(15));
//        System.out.println(FizzBuzz.fizzBuzz(6));
    }
}
