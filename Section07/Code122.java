class Point122 {
    private int x;
    private int y;

    Point122() {}
    Point122(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    void setX(int x) {
        this.x  = x;
    }

    void setY(int y) {
        this.y = y;
    }
}

public class Code122 {
    static void add(Point122 t1, Point122 t2) {
        Point122 pt = new Point122();
        pt.setX(t1.getX() + t2.getX());
        pt.setY(t1.getY() + t2.getY());
        System.out.println("p1 + p2 : (" + pt.getX() + ", " + pt.getY() + ")");
    }

    public static void main(String[] args) {
        Point122 p1 = new Point122(1, 3);
        Point122 p2 = new Point122(5, 8);

        System.out.println("p1 : (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("p2 : (" + p2.getX() + ", " + p2.getY() + ")");
        add(p1, p2);
    }
}
