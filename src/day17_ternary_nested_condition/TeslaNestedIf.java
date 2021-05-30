package day17_ternary_nested_condition;

public class TeslaNestedIf {

    public static void main(String[] args) {

     /*   TeslaNestedIf

char model = 'S';
trim -> "Long range"


when model 'S'
    if trim is "long range":

        "range: 412"
        "top speed: 155 mph"
        "0-60- 3.1sec"
    if trim is "Plaid":

        "range: 412"
        "top speed: 155 mph"
        "0-60- 3.1sec"
    if trim is "Plaid+":

        "range: 412"
        "top speed: 155 mph"
        "0-60- 3.1sec"
when model is '3'
        */

        boolean X = true;
        boolean Y = !X == false;
        boolean Z = Y;

        if (X){
            System.out.println("Hello everyone!");
        }if (Y){
            System.out.println("Today is great");
        }if (Z){
            System.out.println("We are improving ");
        }
    }
}
