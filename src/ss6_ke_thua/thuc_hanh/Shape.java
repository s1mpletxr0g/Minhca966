package ss6_ke_thua.thuc_hanh;

public class Shape {
    private String color;
    private boolean filled;
    public Shape(){

    }
    protected Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean pilled) {
        this.filled = pilled;
    }
    @Override
    public String toString(){
        return " A Shape with color of "+ getColor() +" and "+ (isFilled()?"filled":"not filled");
    }

}
