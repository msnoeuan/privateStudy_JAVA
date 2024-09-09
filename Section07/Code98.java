class Friend {
    String name;
    int age;

    //Friend() {} => 생성자가 하나도 없는 경우에는 자동으로 디폴트 생성자를 제공
    void printFriend() {
        System.out.println("name : " + name + ", age : " + age);
    }
}

public class Code98 {
    public static void main(String[] args) {
        Friend f= new Friend();
        f.printFriend();
        f.name = "Alice";
        f.age = 20;
        f.printFriend();
    }
}
