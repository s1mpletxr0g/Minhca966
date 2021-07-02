package ss7_abstract_class_va_interface.thuc_hanh.edible.MaKiemInterface;

import ss7_abstract_class_va_interface.thuc_hanh.edible.fruit.Apple;
import ss7_abstract_class_va_interface.thuc_hanh.edible.fruit.Fruit;
import ss7_abstract_class_va_interface.thuc_hanh.edible.fruit.Orange;

public class MaKiem2 {
    public static void main(String[] args) {
        Fruit[] fruits=new Fruit[2];
        fruits[0]=new Apple();
        fruits[1]=new Orange();
        for(Fruit fruit: fruits){
            System.out.println(fruit.HowToEat());
        }


    }
}
