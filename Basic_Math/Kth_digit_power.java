//find the kth digit of a no.
//a=5,b=2,k=1 => 5^2=25 => Kth value is 2

public class Kth_digit_power {

    public static void main(String[] args) {
        int a = 6, b = 2, k = 2;
        long power = (long) Math.pow(a, b);
        int i = 1;
        while (power > 0) {
            long ans = power % 10;
            if (k == i) {
                System.out.println("The kth value is : " + ans);
            }
            i++;
            power /= 10;
        }
    }
}
