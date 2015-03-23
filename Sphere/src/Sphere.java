/**
 * Created by Administrator on 2015/3/15.
 */
public class Sphere {
    private double Diameter;
    private final double PI = 3.14159;

    public Sphere(double diameter) {
        setDiameter(diameter);
    }

    public Sphere() {

    }
    public void setDiameter(double diameter) {
        Diameter = diameter;
    }

    public double getDiameter() {
        return Diameter;
    }

    public double getVolume() {
        return PI*Math.pow((Diameter/2),3)*4/3;
    }

    public double getArea() {
        return 4*PI*Math.pow((Diameter / 2), 2);
    }
}
