import java.util.Scanner;

public class Code54 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = S.nextInt();
        int a = 1;

        while(a <= n) {
            if(n % a == 0)
                System.out.println(a + " ");
            a += 1;
        }
        S.close();
    }
}
