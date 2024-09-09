class Student104 {
    int no;
    String name;
    double score;

    Student104(int n) {
        no = n;
    }

    void printStudent() {
        System.out.println("no : " + no + ", name : " + name + ", score : " + score);
    }
}

public class Code104 {
    public static void main(String[] args) {
        //Student104 s1 = new Student104(); => 디폴트 생성자가 없어서 에러 발생
        Student104 s2 = new Student104(10);
        s2.printStudent();
    }
}
