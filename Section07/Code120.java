class Data120 {
    private int x;
    public int y;
    int z;
}

public class Code120 {
    public static void main(String[] args) {
        Data120 data = new Data120();
        //data.x = 10;  => 에러 발생
        data.y = 20;
        data.z = 30;
    }
}
