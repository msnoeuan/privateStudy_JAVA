class Book119 {
    private String title;
    private int price;

    Book119() {}
    Book119(String title, int price) {
        this.title = title;
        this.price = price;
    }

    void printBook() {
        System.out.println("title : " + title);
        System.out.println("price : " + price);
    }
}

public class Code119 {
    public static void main(String[] args) {
        Book119 bk = new Book119("Java Programming", 25000);
        bk.printBook();
        //bk.price = 27000;  => 에러 / private로 정의했기 때문
    }
}
