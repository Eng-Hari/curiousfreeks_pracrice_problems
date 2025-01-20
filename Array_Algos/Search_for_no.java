<<<<<<< HEAD

public class Search_for_no {

    public static void main(String[] args) {
        int n = 5, x = 4, flag = 0;
        int arr[] = {1, 2, 4, 3, 4, 5};
        for (int i = 0; i < n; i++) {
            //     if (arr[i] == x) {
            //         flag = i;
            //     }
            // }
            // System.out.println(flag); -> this returns always the last value

            // => to find the first accurance
            if (arr[i] == x) {
                flag = i;
                break;  // to get first accurance
            }
        }
        System.out.println(flag);

    }
}
=======

public class Search_for_no {

    public static void main(String[] args) {
        int n = 5, x = 4, flag = 0;
        int arr[] = {1, 2, 4, 3, 4, 5};
        for (int i = 0; i < n; i++) {
            //     if (arr[i] == x) {
            //         flag = i;
            //     }
            // }
            // System.out.println(flag); -> this returns always the last value

            // => to find the first accurance
            if (arr[i] == x) {
                flag = i;
                break;  // to get first accurance
            }
        }
        System.out.println(flag);

    }
}
>>>>>>> 95d0495489fb4150426f3a105e2a63125c75aa73
