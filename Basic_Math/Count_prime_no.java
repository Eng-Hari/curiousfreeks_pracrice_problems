
import java.util.Scanner;

public class Count_prime_no {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int flag = 1;
        for (int j = 2; j <= n / 2; j++) {
            if (n % j == 0) {
                flag = 0;
                break;
            }
            if (flag == 1) {
                count++;
            }
        }

        System.out.println(count);
    }

}
