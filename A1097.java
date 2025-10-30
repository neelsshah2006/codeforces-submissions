import java.util.Scanner;

public class A1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean ans = false;
        for (int i = 0; i < 5; i++) {
            String a = sc.next();
            if (a.charAt(0) == s.charAt(0) || a.charAt(1) == s.charAt(1)) {
                ans = true;
            }
        }
        sc.close();
        if (ans) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
