package day35_methods_parameters;

public class Email {

    public static void main(String[] args) {

        buildEmail("gul","cybertek");
    }

    public static void buildEmail(String name, String domain) {

        name = name.replace(" ","_").toLowerCase();
        domain = domain.toLowerCase();
        System.out.println(name + "@" + domain + ".com");
    }

}