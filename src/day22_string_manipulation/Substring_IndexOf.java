package day22_string_manipulation;

public class Substring_IndexOf {

    public static void main(String[] args) {

        //               0123456789101112
        String result = "result count:12345";
        System.out.println(result.indexOf("1"));
        System.out.println(result.indexOf("5"));
        System.out.println(result.substring(13));//or result.substring(13,18)

        //find the index of ':'
        System.out.println(result.indexOf(":"));
        int colonIndex = result.indexOf(":");
        System.out.println(result.substring(colonIndex+1));

        //now we combine them into 1 statement
        System.out.println(result.substring(result.indexOf(":")+1));

        String today = "I learned a lot of [selenium] today";
        /**
         * find indexOf [
         * find index ]
         * provide them as start, end index for substring
         * to print java
         */
        int firstBracket = today.indexOf("[");
        int secondBracket = today.indexOf("]");
        System.out.println(today.substring(firstBracket+1,secondBracket));

    }
}
