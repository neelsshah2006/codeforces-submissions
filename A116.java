import java.util.Scanner;

public class A116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cap = 0;
        int maxCap = 0;
        for (int i = 0; i < n; i++) {
            int exit = sc.nextInt();
            int entry = sc.nextInt();
            cap = cap - exit + entry;
            maxCap = Math.max(maxCap, cap);
        }
        sc.close();
        System.out.println(maxCap);
    }
}