import java.util.Scanner;

public class Code86 {
    static boolean check(int n) {
        if(n % 2 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter one number : ");

        int a = S.nextInt();

        if(check(a))
            System.out.println(a + " is even number");
        else
            System.out.println(a + " is odd number");

        S.close();
    }
}
