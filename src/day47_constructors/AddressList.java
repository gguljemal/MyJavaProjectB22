package day47_constructors;

public class AddressList {

    public static void main(String[] args) {

        Address cybertekAddress = new Address();
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3300");
        cybertekAddress.setCity("McLean");
        cybertekAddress.setState("VA");
        cybertekAddress.setZipCode("22182");

        System.out.println("CybertekSchool address: " + cybertekAddress.toString());

        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3000");
        System.out.println("CybertekSchool after the update address: " + cybertekAddress.toString());

        System.out.println("cybertekAddress.getStreet() = " + cybertekAddress.getStreet());

        Address newAddress = new Address();
        newAddress.setStreet("7921 Jones branch dr Suite 200");
        newAddress.setCity("McLean");
        newAddress.setState("VA");
        newAddress.setZipCode("22102");
        System.out.println(newAddress.toString());

        Address ad = new Address("8501 Tyco Rd Ste 1A", "Vienna", "VA", "22182");
        System.out.println("ad.toString() = " + ad.toString());

        Address d1= new Address();
        System.out.println("d1.toString() = " + d1.toString());

    }
}
