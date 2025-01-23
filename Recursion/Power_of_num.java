package Recursion;

public class Power_of_num {

    public static void main(String[] args) {
        System.out.println(power(5, 2));
    }

    static int power(int n, int i) {
        if (i == 0) {
            return 1;
        }
        return n * power(n, i - 1);
    }
}
