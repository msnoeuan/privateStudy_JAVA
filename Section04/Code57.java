import java.util.Scanner;

public class Code57 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = S.nextInt();
        int count = 0;

        for(int i = 1; i <= n; i ++) {
            if(n % i == 0)
                count ++;
        }

        if(count == 2)
            System.out.println(n + "is a prime number");
        else
            System.out.println(n + "is a composite number");

        S.close();
    }
}
