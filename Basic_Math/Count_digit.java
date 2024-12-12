
public class Count_digit {

    public static void main(String[] args) {
        int num = 9879;
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            count++;
            num /= 10;
        }
        System.out.print(count);
    }
}
