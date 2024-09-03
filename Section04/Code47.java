import java.util.Scanner;

public class Code47 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.print("int >> ");
        int x = S.nextInt();

        System.out.print("double >> ");
        double y = S.nextDouble();

        System.out.print("name >> ");
        String name = S.next();

        System.out.println("x : " + x);
        System.out.println("y : " + y);
        System.out.println("name : " + name);

        S.close();

    }
}
