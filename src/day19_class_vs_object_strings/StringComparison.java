package day19_class_vs_object_strings;

public class StringComparison {

    public static void main(String[] args) {

        String city = "Chicago";

        //equal () method - CASE SENSITIVE COMPARISON
        System.out.println(city.equals("Chicago")); //true
        System.out.println(city.equals("chicago")); //false
        System.out.println(city.equals("Chicago "));//false

        //EQUALIGNORECASE() METHOD - CASE INSENSITIVE COMPARISON
        System.out.println(city.equalsIgnoreCase("Chicago")); //TRUE
        System.out.println(city.equalsIgnoreCase("CHICAGO")); //TRUE
        System.out.println(city.equalsIgnoreCase("ChiCagO"));//true
        System.out.println(city.equalsIgnoreCase("Chiicago"));//false
        System.out.println(city.equalsIgnoreCase("Chi cago"));//false

        if (city.equals("CHICAGO")) {
            System.out.println("equals() true");
        } else {
            System.out.println("equals() false");
        }


        if (city.equalsIgnoreCase("CHICAGO")){
            System.out.println("equalsIgnoreCase() true" );
        }else{
            System.out.println("equalsIgnoreCase() false");
        }

    }
}
