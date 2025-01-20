<<<<<<< HEAD

public class Reverse_digit {

    public static void main(String[] args) {
        int n = 122, rev = 0, digit = 0;
        while (n > 0) {
            digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        System.out.println(rev);
    }
}
=======

public class Reverse_digit {

    public static void main(String[] args) {
        int n = 122, rev = 0, digit = 0;
        while (n > 0) {
            digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        System.out.println(rev);
    }
}
>>>>>>> 95d0495489fb4150426f3a105e2a63125c75aa73
