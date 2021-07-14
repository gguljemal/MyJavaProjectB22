package myPractices;

import java.util.*;

class Main {

    //create your method below

    public static ArrayList<String> removeAll(ArrayList<String> list, String str) {

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).contains(str)) {
                list.remove(list.get(i));
            }
        }

        return list;
    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String target = in.next();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(removeAll(list, target));
    }
}

