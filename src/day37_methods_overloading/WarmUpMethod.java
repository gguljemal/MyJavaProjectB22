package day37_methods_overloading;

public class WarmUpMethod {

    public static void main(String[] args) {

        loginVoid("cybertekStudent", "abc123"); //Positive test
        loginVoid("cybertik", "236lok"); //negative test

        System.out.println(login("cybertekStudent", "abc123"));

        if (login("cybertekStudent", "abc123")) {
            System.out.println("Login successful, welcome to Canvas");
        } else {
            System.out.println("Login failed");
        }

        boolean isLoginSuccess = login("nadir", "mountain");
        System.out.println("isLoginSuccess = " + isLoginSuccess);

        if (login("nadir", "mountain")) {
            System.out.println("Welcome to Canvas, select course or calender");
        } else {
            System.out.println("Something wrong with your credentials");
        }
    }


    public static void loginVoid(String username, String password) {

        String SecretUsername = "cybertekStudent";
        String secretPassword = "abc123";

        if (username.equalsIgnoreCase(SecretUsername) && password.equalsIgnoreCase(secretPassword)) {
            System.out.println("Login successful, welcome cybertekStudent");
        } else {
            System.out.println("Incorrect username or password");
        }
    }

    public static boolean login(String userName, String password) {

        String SecretUsername = "cybertekStudent";
        String secretPassword = "abc123";

        if (userName.equalsIgnoreCase(SecretUsername) && password.equalsIgnoreCase(secretPassword)) {
            return true;
        }

        return false;

        //  return userName.equalsIgnoreCase(SecretUsername) && password.equalsIgnoreCase(secretPassword);

    }
}
