package day30_arrays;

public class ForEachLoopArray {

    public static void main(String[] args) {

        int[] data = {32, 532, 1, 5454, 22, 123, 543, 999, 321, 3};

        System.out.println("*****FOR EACH LOOP*****");
        for (int each : data) {
            System.out.println(each);
        }

        for (int n : data) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println("*****FOR I LOOP*****");
        //repeat above with for loop
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

        System.out.println();
        // print last value in array using length-1

        System.out.println("last value: " + data[data.length - 1]);

        for (int i = data.length - 1; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }
    }
}
