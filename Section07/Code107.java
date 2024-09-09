class Data107 {
    int value;
    static int count;

    void print() {
        System.out.println("value : " + value);
        System.out.println("count : " + count);
    }
}

public class Code107 {
    public static void main(String[] args) {
        Data107 d1 = new Data107();
        Data107 d2 = new Data107();

        d1.print();
        d2.print();
    }

}
