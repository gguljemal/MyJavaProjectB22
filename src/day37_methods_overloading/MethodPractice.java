package day37_methods_overloading;

public class MethodPractice {

    public static void main(String[] args) {

        System.out.println(repeatString("java",3,'|'));
        System.out.println(repeatString("hi",4,'~'));
    }
    public static String repeatString(String word, int times, char delimiter) {

        String result = "";

        for (int i = 0; i <= times; i++) {

//            if (i==times){   ----->> to remove last delimiter
//                 result += word;
//            }else{
//            result += word + delimiter}

            result += word + delimiter;
        }
        return result = result.substring(0,result.length()-1);
    }
}
