package ss7_abstract_class_va_interface.thuc_hanh.edible.MaKiemInterface;

import ss7_abstract_class_va_interface.thuc_hanh.edible.animal.Animal;
import ss7_abstract_class_va_interface.thuc_hanh.edible.animal.Chicken;
import ss7_abstract_class_va_interface.thuc_hanh.edible.animal.Tiger;
import ss7_abstract_class_va_interface.thuc_hanh.edible.Edible;

public class MaKiem {
    public static void main(String[] args) {
        Animal[] animal=new Animal[2];
        animal[0]=new Tiger();
        animal[1]=new Chicken();
        for(Animal animal1:animal){
            System.out.println(animal1.makeSound());
            if( animal1 instanceof Chicken){
                Edible edible= (Chicken) animal1;
                System.out.println(edible.HowToEat());
            }
        }
    }
}
