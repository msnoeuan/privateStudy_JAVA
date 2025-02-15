class Book112 {
    String title;
    int price;

    Book112(){}
    Book112(String title) {
        this.title = title;
    }
    Book112(String title, int price) {
        this(title);
        this.price = price;
    }
}

public class Code112 {
    public static void main(String[] args) {
        Book112 b = new Book112("Java", 250000);

    }

}
