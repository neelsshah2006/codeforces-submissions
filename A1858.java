import java.util.Scanner;

public class A1858 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            boolean annaWins = a > b || (a == b && c % 2 != 0);
            System.out.println(annaWins ? "First" : "Second");
        }
        sc.close();
    }
}
