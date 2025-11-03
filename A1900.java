import java.util.Scanner;

public class A1900 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            int n = sc.nextInt();
            String s = sc.next();
            int count = 0;
            int ans = 0;
            for (char c : s.toCharArray()) {
                if (c == '.')
                    count++;
                else {
                    if (count > 2) {
                        ans = 2;
                        count = 0;
                        break;
                    } else
                        ans += count;
                    count = 0;
                }
            }
            if (count > 2) {
                ans = 2;
            } else
                ans += count;
            System.out.println(ans);
        }
        sc.close();
    }
}
