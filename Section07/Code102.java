class Student102 {
    int no;
    String name;
    double score;

    Student102() {};
    Student102(int n) {
        no = n;
    }
    Student102(int n, String nm) {
        no = n;
        name = nm;
    }
    Student102(int n, String nm, double s) {
        no = n;
        name = nm;
        score = s;
    }

    void printStudent() {
        System.out.println("no : " + no + ", name : " + name + ", score : " + score);
    }
}

public class Code102 {
    public static void main(String[] args) {
        Student102 s1 = new Student102();
        Student102 s2 = new Student102(10);
        Student102 s3 = new Student102(15, "David");
        Student102 s4 = new Student102(20, "Paul", 92.5);

        s1.printStudent();
        s2.printStudent();
        s3.printStudent();
        s4.printStudent();

    }
}
