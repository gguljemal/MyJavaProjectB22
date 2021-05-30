package day29_nested_loop_arrays;

public class CountCharsNestedLoop {

    public static void main(String[] args) {

        String word = "java";

        for (int outer = 0; outer < word.length(); outer++) {

            char outerChar = word.charAt(outer);
            int count = 0;

            for (int inner = 0; inner < word.length(); inner++) {

                char innerChar = word.charAt(inner);

                if (outerChar == innerChar) {
                    count++;
                }
            }
            System.out.println(outerChar + "=" + count);
        }
    }
}
