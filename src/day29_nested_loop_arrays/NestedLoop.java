package day29_nested_loop_arrays;

public class NestedLoop {

    public static void main(String[] args) {

//        for (int minutes = 1; minutes <= 5; minutes++) {
//
//            System.out.println("\nminutes = " + minutes);
//
//            for (int seconds = 1; seconds <= 60; seconds++) {
//
//                System.out.print(seconds + " ");
//            }
//        }

        for (int minutes = 0; minutes <= 4; minutes++) {

            for (int seconds = 1; seconds <= 59; seconds++) {

                System.out.println(minutes +" : "+seconds);

            }
        }

    }
}
