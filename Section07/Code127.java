class Coin {
    private int value;
    private int count;

    Coin() {}
    Coin(int value, int count) {
        this.value = value;
        this.count = count;
    }

    int getValue() {
        return value;
    }

    void setValue(int value) {
        this.value = value;
    }

    int getCount() {
        return count;
    }

    void setCount(int count) {
        this.count = count;
    }
}

class Purse {
    private String owner;
    private Coin coin[];

    Purse() {}
    Purse(String owner, Coin coin[]) {
        this.owner = owner;
        this.coin = coin;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Coin[] getCoin() {
        return coin;
    }

    public void setCoin(Coin[] coin) {
        this.coin = coin;
    }
}

public class Code127 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(500, 4);
        Coin coin2 = new Coin(100, 3);
        Coin coin3 = new Coin(50, 6);
        Coin coin4 = new Coin(10, 7);

        Coin coin[] = {coin1, coin2, coin3, coin4};

        Purse purse = new Purse("Alice", coin);

        System.out.println(purse.getOwner() + "지갑의 각 동전 개수");
        for(Coin c : purse.getCoin())
            System.out.println(c.getValue() + "원 : " + c.getCount() + "개");

        int total = 0;
        for(Coin c : purse.getCoin()) {
            total += c.getValue() * c.getCount();
        }

        System.out.println(purse.getOwner() + "는 지갑에 " + total + "원 있습니다.");
    }
}
