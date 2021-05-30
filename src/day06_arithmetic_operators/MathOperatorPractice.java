package day06_arithmetic_operators;

public class MathOperatorPractice {

    public static void main( String[] args){

     int toyota = 431;
     int honda = 233;
     int vws = 2;
     int tesla = 20;
     int nissan = 1;
     int bmw = 155;

     int totalCars = toyota+honda+vws+tesla+nissan+bmw;

        System.out.println( "There are " + totalCars + " cars in parking lot");

        String pizza = "hawaiian";
        int slice = 8;
        int people = 4;
        int slicePerPerson = slice/people;

        System.out.println("There are "+slicePerPerson+" slices per person");

        System.out.println("We ordered "+pizza+ " pizza with " + slice + " slices, "+ people+" people ate "+slicePerPerson+" slices each.");
    }
}
