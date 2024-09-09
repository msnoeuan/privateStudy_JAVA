class Dog99 {
    String name;
    String color;

    Dog99() {
        System.out.println("Default constructor is called");
    }

    void printDog() {
        System.out.println("name : " + name);
        System.out.println("color : " + color);
    }
}

public class Code99 {
    public static void main(String[] args) {
        Dog99 d = new Dog99();  //여기에서 Dog99() 디폴트 생성자를 호출
        d.printDog();
    }
}
