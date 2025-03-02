class Parent130 {
    Parent130() {
        System.out.println("parent constructor is called");
    }

    void printParent() {
        System.out.println("I am parent");
    }
}

class Child130 extends Parent130 {
    Child130() {
        System.out.println("child constructor is called");
    }
    void printChild() {
        System.out.println("I am child");
    }
}

public class Code130 {
    public static void main(String[] args) {
        Child130 c = new Child130();
        c.printParent();
        c.printChild();
    }
}
