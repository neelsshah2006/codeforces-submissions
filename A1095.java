import java.util.Scanner;

public class A1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();

        StringBuilder result = new StringBuilder();
        int a = 1;
        int i = 0;
        while (i < n) {
            result.append(s.charAt(i));
            i += a;
            a++;
        }
        System.out.println(result.toString());
    }
}