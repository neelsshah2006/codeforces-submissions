import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B1862 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int prev = sc.nextInt();
            List<Integer> ans = new ArrayList<>();
            ans.add(prev);
            for (int i = 0; i < n - 1; i++) {
                int curr = sc.nextInt();
                if (curr < prev)
                    ans.add(curr);

                ans.add(curr);
                prev = curr;
            }

            System.out.println(ans.size());
            for (int i : ans)
                System.out.print(i + " ");
            System.out.println();
        }
        sc.close();
    }
}
