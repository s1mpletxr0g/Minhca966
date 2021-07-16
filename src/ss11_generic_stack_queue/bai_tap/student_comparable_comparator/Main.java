package ss11_generic_stack_queue.bai_tap.student_comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Na", 18, "Ha noi"));
        students.add(new Student("Suong", 20, "Quang Nam"));
        students.add(new Student("My", 21, " Quang Binh"));
        students.add(new Student("Nhung", 21, " Quang Ngai"));
        students.add(new Student("My", 20, " Quang Ngai"));


        System.out.println(" truoc khi sap xep ");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students);

        System.out.println(" sau khi sap xep ");
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
