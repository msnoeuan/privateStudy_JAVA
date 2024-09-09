class PersonInfo106 {
    String name;
    int age;
    double height;

    PersonInfo106() {};
}

public class Code106 {
    public static void main(String[] args) {
        PersonInfo106 p = new PersonInfo106();
        p.name = "Alice";
        p.age = 12;
        p.height = 120.5;

        System.out.println("p.name : " + p.name);
        System.out.println("p.age : " + p.age);
        System.out.println("p.height : " + p.height);

    }

}
