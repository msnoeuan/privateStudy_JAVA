public class Code123 {
    static void change(Point122 t) {
        t.setX(10);
        t.setY(33);
    }

    public static void main(String[] args) {
        Point122 p = new Point122(2, 7);
        System.out.println("before : (" + p.getX() + ", " + p.getY() + ")");
        change(p);
        System.out.println("after : (" + p.getX() + ", " + p.getY() + ")");
    }
}
