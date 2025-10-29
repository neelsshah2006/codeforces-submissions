import java.util.Scanner;

public class A281 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        char c = s.charAt(0);

        if (c >= 'a' && c <= 'z') {
            StringBuilder sb = new StringBuilder(s);
            sb.setCharAt(0, Character.toUpperCase(c));
            s = sb.toString();
        }
        System.out.println(s);
    }
}
