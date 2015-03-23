/**
 * Created by Administrator on 2015/3/15.
 */
public class MultiSphere {

    public static void main(String[] args) {
        Sphere sp1 = new Sphere(1.00);
        Sphere sp2 = new Sphere(2.00);
        Sphere sp3 = new Sphere();
        sp3.setDiameter(3.00);
        System.out.println("The Volume of Sphere1 is:" + sp1.getVolume());
        System.out.println("The Area of Sphere1 is:" + sp1.getArea());
        System.out.println("The Diameter of Sphere1 is:" + sp1.getDiameter());

        System.out.println("The Volume of Sphere2 is:" + sp1.getVolume());
        System.out.println("The Area of Sphere2 is:" + sp2.getArea());

        System.out.println("The Volume of Sphere3 is:" + sp3.getVolume());
        System.out.println("The Area of Sphere3 is:" + sp1.getArea());



    }
}
