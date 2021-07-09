package ss7_abstract_class_va_interface.thuc_hanh.MaKiemInterface;

import ss7_abstract_class_va_interface.thuc_hanh.Edible;
import ss7_abstract_class_va_interface.thuc_hanh.animal.Animal;
import ss7_abstract_class_va_interface.thuc_hanh.animal.Chicken;
import ss7_abstract_class_va_interface.thuc_hanh.animal.Tiger;

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
