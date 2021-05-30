package day31_arrays;

public class StringToStringArray {

    public static void main(String[] args) {

        String[] languages = {"java", "python", "c++", "sql", "ruby", "javascript"};

        System.out.println(String.join("*", languages));
        System.out.println(String.join("#", languages));

        String allLanguages = String.join(" ",languages);
        System.out.println("allLanguages = " + allLanguages);


    }
}
