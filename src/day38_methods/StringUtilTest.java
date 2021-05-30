package day38_methods;

public class StringUtilTest {

    public static void main(String[] args) {

        String userName = "";
        if (StringUtils.isNullOrEmpty(userName)) {
            System.out.println("FAIL: Username cannot be null or empty");
        }

        System.out.println("isPalindrome = " + StringUtils.isPalindrome("kayak"));
        System.out.println("isPalindrome = " + StringUtils.isPalindrome("kayan"));

        System.out.println("Reverse of str = " + StringUtils.reverse("java"));
    }

}
