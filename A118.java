import java.util.Scanner;

public class A118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        sc.close();

        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ("aeiouy".indexOf(c) == -1) {
                result.append('.').append(c);
            }
        }
        System.out.println(result.toString());
    }
}
