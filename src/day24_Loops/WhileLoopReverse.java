package day24_Loops;

public class WhileLoopReverse {

    public static void main(String[] args) {

        int count = 5;
        while (count >= 0) {
            System.out.println("count = " + count);
            count--;
        }

        System.out.println("Finished the count");

        int unreadSms = 10;

        while (unreadSms >= 0) {
            System.out.println("I have total " + unreadSms + " \uD83D\uDC8C unread sms");
            --unreadSms;
        }
        System.out.println("All done");

    }
}
