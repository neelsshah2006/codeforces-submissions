import java.util.Scanner;

public class B1391 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            t--;

            int n = sc.nextInt();
            int m = sc.nextInt();
            int changes = 0;
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                if (i == n - 1) {
                    for (char c : s.toCharArray()) {
                        if (c == 'D') {
                            changes++;
                        }
                    }
                } else {
                    if (s.charAt(m - 1) == 'R') {
                        changes++;
                    }
                }
            }

            System.out.println(changes);
        }

        sc.close();
    }
}
