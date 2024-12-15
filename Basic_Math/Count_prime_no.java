
import java.util.Scanner;

public class Count_prime_no {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int j = 2; j <= n / 2; j++) {
            if (n % j == 0) {
                break;
            }
            count++;
        }

        System.out.println(count);
    }
}
