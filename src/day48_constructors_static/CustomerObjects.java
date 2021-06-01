package day48_constructors_static;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerObjects {

    public static void main(String[] args) {

        Customer customer1 = new Customer();
        //System.out.println(customer.toString());  // print with default values that are set in no - args constructor
        System.out.println(customer1);

        customer1.setName("Bob");
        customer1.setId(1);
        System.out.println(customer1);

        Customer customer2 = new Customer("Mike", 3);
        Customer customer3 = new Customer("John", 756);

        System.out.println(customer2);
        System.out.println(customer3);

        //array of the customer
        Customer[] customers = {customer1, customer2, customer3, new Customer("Bashir", 556)};

        //arrayList of Customer objects
        List<Customer> customerList = new ArrayList<>();
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(new Customer("Bashir", 459));
        customerList.add(new Customer("Suleyman", 4454));

        //print info of first customer object in array and arrayList
        System.out.println("customers[0] = " + customers[0]);
        System.out.println(customerList.get(0));

        System.out.println("customerList = " + customerList); // print toString() info of all Customer objects

        System.out.println("-------FOR EACH LOOP----------");
        for (Customer each : customerList) {
            System.out.println("each = " + each);
        }

        System.out.println("-----------FOR LOOP-------------");
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));
        }

        // get only names of Customer in the List
        customerList.forEach(each -> System.out.println(each.getName()));  //landa

        for (Customer each : customerList) {
            System.out.println(each.getName());
        }

    }
}
