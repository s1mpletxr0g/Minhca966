package ss4_lop_va_doi_tuomg_tromh_java.bai_tap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Fan {
    private  int speed =1 ;
    private  boolean on = false;
    private  double radius = 5;
    private  String color  ="blue";




    public Fan() {

    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean getOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setSpeed() {
        this.speed = speed;

    }

    public void setOn() {
        this.on = on;

    }

    public void setRadius() {
        this.radius = radius;
    }

    public void setColor() {
        this.color = color;
    }
    public void TocDo(){
        if(getSpeed()==1){
            System.out.println(" toc do qua : Slow");
        }
        if(getSpeed()==2){
            System.out.println(" toc do qua : Medium");
        }
        if(getSpeed()==3){
            System.out.println(" toc do qua : speed");
        }
    }

    @Override
    public String toString() {
        if (!this.on){
            return " quat tat";
        }
        return "Speed" + speed + "color" + color + "radius "  + radius +"quat bat";
    }



    public static void main(String[] args) {


        Fan Fan1 =new Fan( 5,  true,  5 ,  "blue");
        System.out.println(Fan1.toString());



    }
}
