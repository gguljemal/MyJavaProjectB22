package day23_string_manipulation_while_loop;

public class SMSMessage {

    public static void main(String[] args) {

        String message = "Sender: [Nadir] From Number<2223334444> Message:{Hello, lets code some java}";

        int start = message.indexOf("[");
        int end = message.indexOf("]");
        System.out.println(start);
        System.out.println(end);
        System.out.println(message.substring(start + 1, end));
        String sender = message.substring(start + 1, end);

        String mobile = message.substring(message.indexOf("<") + 1, message.indexOf(">"));
        System.out.println("mobile = " + mobile);

        String text = message.substring(message.indexOf("{") + 1, message.indexOf("}"));
        System.out.println("text = " + text);

        System.out.println(" Fikret ".trim());
        sender = sender.trim();

        if (sender.equals("Saim")) {
            System.out.println("Message from Saim about homework");
        } else {
            System.out.println("Someone else message");
        }


    }
}
