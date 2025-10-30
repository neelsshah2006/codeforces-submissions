import java.util.Scanner;

public class A492 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int sum = 1;
        int count = 0;
        while (n >= sum) {
            n -= sum;
            count++;
            sum += count + 1;
        }

        System.out.println(count);
    }
}