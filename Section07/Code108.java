class Student108 {
    static int numberOfStudent;
    String name;
    double score;

    Student108() {
        numberOfStudent ++;
    }

    Student108(String n, double s) {
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

public class Code108 {
    public static void main(String[] args) {
        Student108 s1 = new Student108("Alice", 90.5);
        Student108 s2 = new Student108("David", 88.3);
        Student108 s3 = new Student108("Cindy", 77.1);

        s1.print();
        s2.print();
        s3.print();
    }
}
