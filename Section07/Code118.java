class Block118 {
    Block118() {
        System.out.println("I am constructor");
    }

    static {
        System.out.println("I am static block");
    }
}

public class Code118 {
    public static void main(String[] args) {
        Block118 b1 = new Block118();
        Block118 b2 = new Block118();
    }
}
