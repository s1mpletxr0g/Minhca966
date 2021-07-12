package ss1_Introduction_to_Java.nhap_2;

import java.util.Scanner;

public abstract class Animal implements IntergaceAnimal {
    private String eat;
    private String go;

    public Animal() {
    }

    public Animal(String eat, String go) {
        this.eat = eat;
        this.go = go;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public String getGo() {
        return go;
    }

    public void setGo(String go) {
        this.go = go;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "eat='" + eat + '\'' +
                ", go='" + go + '\'' +
                '}';
    }
}



