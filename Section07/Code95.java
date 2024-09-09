class Car95 {
    String kind;
    String color;
    int year;
}

public class Code95 {
    public static void main(String[] args) {
        Car95 myCar = new Car95();
        myCar.kind = "Sonata";
        myCar.color = "white";
        myCar.year = 2015;

        Car95 yourCar = new Car95();
        yourCar.kind = "Pride";
        yourCar.color = "blue";
        yourCar.year = 2017;

        System.out.println(myCar);   //인스터스 참조 값
        System.out.println(yourCar);
    }
}
