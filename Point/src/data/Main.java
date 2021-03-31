package data;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Point p1 = new Point(1.1, 2, 3);
        System.out.println(p1.length_2());
        p1.setPoint(2, 3, 4);
        System.out.println(p1.length_2());
    }
}
