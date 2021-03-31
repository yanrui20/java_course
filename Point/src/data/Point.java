package data;

//import static java.lang.Math.sqrt;

public class Point {
    double x;
    double y;
    double z;
    public Point(double x, double y, double z) {
        setPoint(x, y, z);
    }
    public void setPoint(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double length_2() {
        return x * x + y * y + z * z;
    }
}
