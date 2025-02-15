class Student113 {
    int number;
    String name;
    double score;

    Student113(){}
    Student113(int number) {
        this.number = number;
    }
    Student113(int number, String name) {
        this(number);  //다른 생성자 호출 : Student113(int number)
        this.name = name;
    }
    Student113(int number, String name, double score) {
        this(number, name);  //다른 생성자 호출 : Student113(int number, String name)
        this.score = score;
    }

    //다른 생성자 호출은 반드시 첫 줄에 작성해야 함!
}

public class Code113 {
    public static void main(String[] args) {
        Student113 s = new Student113(10, "Paul", 88.5);
    }
}
