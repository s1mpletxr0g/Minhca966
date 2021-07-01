package ss6_ke_thua.bai_tap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Point3D extends Point2D {
    private int z;
    protected Point3D(){

    }
    public Point3D(int x,int y,int z){
        super( x,y);
        this.z=z;
    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public int getY() {
        return super.getY();
    }

    public int getZ() {
        return this.z;
    }

    @Override
    public void setX(int x) {
        super.setX(x);
    }

    @Override
    public void setY(int y) {
        super.setY(y);
    }
    public void setZ(int z){
        this.z=z;
    }

    public void getXyz(int x, int y, int z) {
        System.out.print("Array of"+"["+x+"]"+"["+y+"]"+"["+z+"]");
    }

    @Override
    public String toString() {
        return "Point3D{" +
                super.toString()+
                "z=" + z +
                '}';
    }
}
