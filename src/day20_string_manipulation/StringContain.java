package day20_string_manipulation;

public class StringContain {

    public static void main(String[] args) {

        String company = "Capital one";
        System.out.println(company.contains("i")); //true
        System.out.println(company.contains("ital"));//true
        System.out.println(company.contains("l o")); //true

        //if company contains space, print "multiple words company name"
        //else "single word company name"

        if (company.contains(" ")){
            System.out.println("multiple words company name");
        }else {
            System.out.println("single word company name");
        }

        String etsyTitle = "Wooden spoon | Etsy";
        //check if "|" is in etsyTitle
        if (etsyTitle.contains(" | ")){
            System.out.println("Pass - title check passed");
        }else {
            System.out.println("Fail - title check failed");
        }

    }
}
