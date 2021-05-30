package day27_loops;

public class SubstringInLoop {

    public static void main(String[] args) {

        String list = "cat,car,cat,red_car,java,selenium";

        for (int i = 0; i < list.length() - 2; i++) {

            System.out.println(list.substring(i, i + 3));

            if (list.substring(i, i + 3).equalsIgnoreCase("cat") || list.substring(i, i + 3).equalsIgnoreCase("car")) {
                System.out.println("cat or car found");
            }
        }

        for (int i = 0; i < list.length() - 2; i++) {

            String part = list.substring(i, i + 3);

            System.out.println("part = " + part);

            if (part.equalsIgnoreCase("cat") || part.equalsIgnoreCase("car")) {
                System.out.println("cat or car found");
            }

        }

    }
}
