package ss7_abstract_class_va_interface.thuc_hanh.animal;

import ss7_abstract_class_va_interface.thuc_hanh.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "ò ó o";
    }

    @Override
    public String HowToEat() {
        return "could be fried";
    }
}
