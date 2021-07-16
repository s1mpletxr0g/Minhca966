package ss11_generic_stack_queue.demo_comparator_comparable;

import java.util.Comparator;

public class CompaByName  implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}
