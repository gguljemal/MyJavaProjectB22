package day25_for_loop;

public class WhileHungry {

    public static void main(String[] args) {

        boolean isHungry = true;
        int banana = 0;
        int countToFull = 3;

        while (isHungry) {
            banana++;
            System.out.println("Eating a banana: \uD83C\uDF4C " + banana);
            if (banana == countToFull) {
                isHungry = false;
            }
        }
    }
}
