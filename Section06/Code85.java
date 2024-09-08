import java.util.Scanner;

public class Code85 {
    static int add(int x, int y) {
        int result;
        result = x + y;
        return result;
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter two integers : ");
        int a = S.nextInt();
        int b = S.nextInt();
        int c = add(a, b);

        System.out.println(a + " + " + b + " = " + c);
        S.close();
    }
}
