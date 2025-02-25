class Book121 {
    private String title;
    private int price;

    Book121() {}
    Book121(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    void printBook() {
        System.out.println("title : " + title);
        System.out.println("price : " + price);
    }
}

public class Code121 {
    public static void main(String[] args) {
        Book121 bk = new Book121("Java Programming", 25000);
        bk.printBook();
        bk.setPrice(27000);
        bk.setTitle("Java Programming 2");
        System.out.println("title : " + bk.getTitle());
        System.out.println("price : " + bk.getPrice());
    }
}
