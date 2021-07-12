package ss1_Introduction_to_Java.nhap_2;

public class Cat  extends Animal {
private String hunt;

    public Cat(String hunt) {
        this.hunt = hunt;
    }

    public Cat(String eat, String go, String hunt) {
        super(eat, go);
        this.hunt = hunt;
    }

    public Cat() {
    }

    @Override
    public String getEat() {
        return super.getEat();
    }

    @Override
    public void setEat(String eat) {
        super.setEat(eat);
    }

    @Override
    public String getGo() {
        return super.getGo();
    }

    @Override
    public void setGo(String go) {
        super.setGo(go);
    }

    public String getHunt() {
        return hunt;
    }


    public void setHunt(String hunt) {
        this.hunt = hunt;
    }

    @Override
    public void add() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public String toString() {
        return "mèo ăn "+ getEat()+" mèo đi "+ getGo()+" mèo săn "+ getHunt();
    }
}
