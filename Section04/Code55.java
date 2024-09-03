import java.util.Scanner;

public class Code55 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = S.nextInt();

        while(n > 0) {
            int m = n % 10;
            System.out.println(m);
            n /= 10;
        }
        S.close();
    }
}
