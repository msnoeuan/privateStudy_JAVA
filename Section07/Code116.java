class Data116 {
    static int x;
    int y;
    
    Data116(int x, int y) {
        Data116.x = x;  //클래스.static변수명
        this.y = y;
    }

    void print() {
        System.out.println("x : " + x);
        System.out.println("y : " + y);  //static으로 메소드 선언시 오류 발생
    }
}

public class Code116 {
    public static void main(String[] args) {
        Data116 d = new Data116(10, 20);
        d.print();
    }
}
