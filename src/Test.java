public class Test {
    public static void main(String[] args){
        Point2D point2D = new Point2D();
        System.out.println(point2D.toString());
        point2D.setXY(2.4f, 3.6f);
        System.out.println("x = "+point2D.getXY()[0]+", y = "+point2D.getXY()[1]);


        Point2D point2D1 = new Point2D(1.2f, 5.5f);
        System.out.println(point2D1.toString());
        point2D1.setXY(0.5f, 0.1f);
        System.out.println("x = "+point2D1.getXY()[0]+", y = "+point2D1.getXY()[1]);

        Point3D point3D = new Point3D();
        System.out.println(point3D.toString());
        point3D.setXYZ(0.1f, 0.2f, 0.3f);
        System.out.println("x = "+point3D.getXYZ()[0]+", y = "+point3D.getXYZ()[1]+", z = "+point3D.getXYZ()[2]);

        Point3D point3D1 = new Point3D(1.1f, 1.2f, 1.3f);
        System.out.println(point3D1.toString());
        point3D1.setXYZ(2.1f, 2.2f, 2.3f);
        System.out.println("x = "+point3D1.getXYZ()[0]+", y = "+point3D1.getXYZ()[1]+", z = "+point3D1.getXYZ()[2]);
    }
}