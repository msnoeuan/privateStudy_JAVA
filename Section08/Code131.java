class Parent131 {
    void printParent() {
        System.out.println("I am parent");
    }
}

class Child131 extends Parent131 {
    Child131() {
        System.out.println("child constructor is called");
    }

    void printChild() {
        System.out.println("I am child");
    }
}

public class Code131 {
    public static void main(String[] args) {
        Child131 c = new Child131();  //부모 생성자 호출(디폴트 생성자) 호출 후에 자식 생성자 호출
        c.printParent();
        c.printChild();
    }
}
