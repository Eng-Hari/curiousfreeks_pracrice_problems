<<<<<<< HEAD

import java.util.Scanner;

public class Array_input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the valur fo array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Inpuit over");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
=======

import java.util.Scanner;

public class Array_input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the valur fo array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Inpuit over");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
>>>>>>> 95d0495489fb4150426f3a105e2a63125c75aa73
