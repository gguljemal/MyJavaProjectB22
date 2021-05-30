package day37_methods_overloading;

public class VarArgs {

    public static void main(String[] args) {

        addNumbers(10,5);
        addNumbers(100,88,63,55,98,74,123);
        addNumbers();
    }

    public static void addNumbers(int... x) { // var args
        //inside the method it is used as regular array
        int sum = 0;
        for (int n : x) {
            sum += n;
        }
        System.out.println("sum = " + sum);
    }
}
