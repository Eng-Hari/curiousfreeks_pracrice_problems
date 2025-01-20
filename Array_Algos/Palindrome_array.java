<<<<<<< HEAD

public class Palindrome_array {

    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1, 2, 3, 4, 1};
        int i = 0;
        int j = n - 1;
        int flag = 1;
        while (i < n) {
            if (arr[i] != arr[j]) {
                flag = 0;
                break;
            }
            i++;
            j--;
        }
        if (flag == 1) {
            System.out.println("Palindrme");
        } else {
            System.out.println("Not a palindrome");
        }

    }
}
=======

public class Palindrome_array {

    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1, 2, 3, 4, 1};
        int i = 0;
        int j = n - 1;
        int flag = 1;
        while (i < n) {
            if (arr[i] != arr[j]) {
                flag = 0;
                break;
            }
            i++;
            j--;
        }
        if (flag == 1) {
            System.out.println("Palindrme");
        } else {
            System.out.println("Not a palindrome");
        }

    }
}
>>>>>>> 95d0495489fb4150426f3a105e2a63125c75aa73
