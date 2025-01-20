<<<<<<< HEAD

public class Middle_of_three {

    public static void main(String[] args) {
        int a = 978, b = 518, c = 300;
        /*given 3 no.
             cheack for 2 no.
               => b is middle   ==>     a<b<c and c<b<a
               => a is middle   ==>     b<a<c and c<a<b
         */
        if (a <= b && b <= c || c <= b && b <= a) {
            System.out.println("b is middle");
        } else if (b <= a && a <= c || c <= a || a <= b) {
            System.out.println("a is middle");
        } else {
            System.out.println("c is middle");
        }

    }
}
=======

public class Middle_of_three {

    public static void main(String[] args) {
        int a = 978, b = 518, c = 300;
        /*given 3 no.
             cheack for 2 no.
               => b is middle   ==>     a<b<c and c<b<a
               => a is middle   ==>     b<a<c and c<a<b
         */
        if (a <= b && b <= c || c <= b && b <= a) {
            System.out.println("b is middle");
        } else if (b <= a && a <= c || c <= a || a <= b) {
            System.out.println("a is middle");
        } else {
            System.out.println("c is middle");
        }

    }
}
>>>>>>> 95d0495489fb4150426f3a105e2a63125c75aa73
