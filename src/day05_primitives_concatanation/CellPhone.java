package day05_primitives_concatanation;

public class CellPhone {

    public static void main(String[] args){

        String brand = "Apple";
        String model = "iPhone 11";
        String color = "Silver";
        double price = 699.0;
        int storage = 256;
        boolean hasCamera = true;

        System.out.println("hasCamera = " + hasCamera);
        System.out.println("storage = " + storage);
        System.out.println("price = " + price);
        System.out.println("color = " + color);
        System.out.println("model = " + model);
        System.out.println("brand = " + brand);

        //with message

        System.out.println("Brand is "+brand);
        System.out.println("Model is "+ model);
        System.out.println("Color is "+color);
        System.out.println("Price is "+price);
        System.out.println("Storage is "+storage+" GB");
        System.out.println("Has camera?- "+hasCamera);



    }
}
