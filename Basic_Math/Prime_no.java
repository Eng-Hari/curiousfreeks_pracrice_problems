
public class Prime_no {

    public static void main(String[] args) {
        int n = 57;
        boolean flag = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % 2 == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("its a prime no.");
        } else {
            System.out.println("its not a prime no.");
        }
    }
}
