package day28_loops;

public class BreakVsContinue {

    public static void main(String[] args) {

        //BREAK statement

        for (int i = 0; i <= 5; i++) {
            System.out.print(i);
            if (i == 3) {
                break;
            }

        }

        //=============================================================
        
        System.out.println();
        for (int i = 0; i <= 5; i++) {

            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

    }
}
