class Student109 {
    static int numberOfStudent;
    String name;
    double score;

    Student109() {};

    Student109(String n, double s) {
        numberOfStudent ++;
        name = n;
        score = s;
    }

    void print() {
        System.out.println("name : " + name);
        System.out.println("score : " + score);
        System.out.println("numberOfStudent : " + numberOfStudent);
    }
}

public class Code109 {
    public static void main(String[] args) {
        Student109 s1 = new Student109("Alice", 90.5);
        s1.print();
        Student109 s2 = new Student109("David", 88.3);
        s2.print();
        Student109 s3 = new Student109("Cindy", 77.1);
        s3.print();
    }
}
