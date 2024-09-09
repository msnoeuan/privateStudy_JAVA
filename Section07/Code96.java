class Car96 {
    String kind;
    String color;
    int year;
}

public class Code96 {
    public static void main(String[] args) {
        Car96 myCar = new Car96();
        myCar.kind = "Sonata";
        myCar.color = "white";
        myCar.year = 2015;

        Car96 myCar2;
        myCar2 = myCar;

        System.out.println(myCar);
        System.out.println(myCar2);
    }

}
