
public class Factorial_n {

    public static void main(String[] args) {
        int n = 4;
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact *= i;
        }
        System.out.println(fact);

    }
}
