public class Code124 {
    static Point122 add(Point122 t1, Point122 t2) {
        Point122 t3 = new Point122();
        t3.setX(t1.getX() + t2.getX());
        t3.setY(t1.getY() + t2.getY());
        return t3;
    }

    public static void main(String[] args) {
        Point122 p1 = new Point122(10, 20);
        Point122 p2 = new Point122(11, 33);
        Point122 p3 = add(p1, p2);

        System.out.println("p3 : (" + p3.getX() + ", " + p3.getY() + ")");
    }
}
