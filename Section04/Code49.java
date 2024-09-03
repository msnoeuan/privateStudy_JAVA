import java.util.Scanner;

public class Code49 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter three numbers : ");

        int a = S.nextInt();
        int b = S.nextInt();
        int c = S.nextInt();

        int max = 0;

        if(a > b)
            max = a;
        else
            max = b;

        if(c > max)
            max = c;

        System.out.println("max : " + max);
        S.close();
    }
}
