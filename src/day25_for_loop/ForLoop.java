package day25_for_loop;

public class ForLoop {

    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello world " + i);
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 15; i++) {
            System.out.print("\uD83C\uDF1F * ");
        }

        ///=================================================================

        System.out.println();
        String stars = "";
        //fill 5 stars stars variable

        for (int i = 0; i < 5; i++) {
            stars += "* ";
        }
        System.out.println("stars = " + stars.trim());
    }
}
