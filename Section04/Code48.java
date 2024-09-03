import java.util.Scanner;

public class Code48 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter a : ");
        int a = S.nextInt();

        System.out.print("Enter b : ");
        int b = S.nextInt();

        int max = 0;

        if(a > b)
            max = a;
        else
            max = b;

        System.out.println("max : " + max);
        S.close();
    }
}
