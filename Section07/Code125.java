class Student125 {
    private String name;
    private int score;

    Student125(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    void print() {
        System.out.println( name + "(" + score + ")");
    }
}

public class Code125 {
    public static void main(String[] args) {
        Student125 st[] = new Student125[5];
        st[0] = new Student125("Alice", 88);
        st[1] = new Student125("Tom", 98);
        st[2] = new Student125("Jenny", 80);
        st[3] = new Student125("Betty", 79);
        st[4] = new Student125("Daniel", 91);

        int total = 0;

        for(int i = 0; i < st.length; i ++) {
            total += st[i].getScore();
        }

        double average = (double)total / st.length;
        System.out.println("average : " + average);
    }
}
