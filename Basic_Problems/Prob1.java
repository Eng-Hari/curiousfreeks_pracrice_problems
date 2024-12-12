<<<<<<< HEAD
/*Prob 1 : Write a program that takes an integer, then a string,
 then a char from the user and prints them in the screen. */
import java.util.Scanner;

public class Prob1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the integer : ");
        int num = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the string : ");
        String name = sc.nextLine();

        System.out.println("Enter the char : ");
        char char_value = sc.next().charAt(0);

        sc.close();
        System.out.println("The integer is : " + num);
        System.out.println("The string is : " + name);
        System.out.println("The character is : " + char_value);
    }
}
=======
/*Prob 1 : Write a program that takes an integer, then a string,
 then a char from the user and prints them in the screen. */
import java.util.Scanner;

public class Prob1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the integer : ");
        int num = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the string : ");
        String name = sc.nextLine();

        System.out.println("Enter the char : ");
        char char_value = sc.next().charAt(0);

        sc.close();
        System.out.println("The integer is : " + num);
        System.out.println("The string is : " + name);
        System.out.println("The character is : " + char_value);
    }
}
>>>>>>> e5615d5bf635995ee07d36bfd4e9da9685826e2d
