import java.util.Arrays;
import java.util.Scanner;

public class A339 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        String k[] = s.split("\\+");
        Arrays.sort(k);
        String result = String.join("+", k);
        System.out.println(result);
    }
}
