class Friend101 {
    String name;
    int age;

    Friend101() {}  //디폴트 생성자
    Friend101(String n, int a) {
        name = n;
        age = a;
    }

    void printFriend() {
        System.out.println("name : "+ name + ", age : " + age);
    }
}

public class Code101 {
    public static void main(String[] args) {
        Friend101 f = new Friend101("Alice", 20);
        f.printFriend();
    }
}
