import java.util.Scanner;

public class A282 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ops = sc.nextInt();
        int x = 0;
        for (int i = 0; i < ops; i++) {
            String s = sc.next();
            if (s.contains("++"))
                x++;
            else
                x--;
        }
        System.out.println(x);
        sc.close();
    }
}