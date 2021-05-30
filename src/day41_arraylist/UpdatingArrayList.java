package day41_arraylist;

import java.util.*;

public class UpdatingArrayList {

    public static void main(String[] args) {

        List<String> myCars = new ArrayList<>();

        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add("tesla");
        myCars.add(0, "jeep");
        myCars.add(1, "lada");
        myCars.add(2, "yugo");

        System.out.println("myCars = " + myCars);

        String allCars = myCars.toString();
        System.out.println("converting List to String " + allCars);

        //  change jeep to lamborghini
        myCars.set(0, "Lamborghini");
        System.out.println(myCars);

        myCars.set(4, "honda");
        System.out.println(myCars);

        // find the index of "ford"
        int indexFord = myCars.indexOf("ford");
        System.out.println(indexFord);
        System.out.println(myCars.indexOf("ford"));

        // change moskvich to jiguli
        myCars.set(myCars.indexOf("moskvich"), "jiguli");
        System.out.println(myCars);

        //replace ford with trabant using single statement
        myCars.set(myCars.indexOf("ford"), "trabant");
        System.out.println("myCars = " + myCars);

        if (myCars.contains("lada")) {
            myCars.set(myCars.indexOf("lada"), "bugatti");
        } else {
            System.out.println("lada is not find");
        }

        System.out.println("after set bugatti = " + myCars);

        /**
         * lamborghini -> prius
         * toyota -> lexus
         * trabant -> audi
         */

        for (int i = 0; i < myCars.size(); i++) {

            if (myCars.get(i).equals("lamborghini")) {
                myCars.set(i, "prius");
            } else if (myCars.get(i).equals("toyota")) {
                myCars.set(i, "lexus");
            } else if (myCars.get(i).equals("trabant")) {
                myCars.set(i, "prius");
            }
        }

        System.out.println("after loop = " + myCars);
    }
}
