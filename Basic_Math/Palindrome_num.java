
public class Palindrome_num {

    public static void main(String[] args) {
        int num = 12321;
        int reversed = 0;
        int original = num;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        if (reversed == original) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}
