package ss11_generic_stack_queue.demo_comparator_comparable;

import java.util.Comparator;

public class CompaAge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.age-o2.age;
    }
}
