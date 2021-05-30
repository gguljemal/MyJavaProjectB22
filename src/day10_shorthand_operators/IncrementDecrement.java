package day10_shorthand_operators;

public class IncrementDecrement {

    public static void main(String[] args) {

        int i = 1;
        System.out.println("i = " + i);

        i++; //2
        System.out.println("i = " + i);

        i++; //3
        i++; //4
        ++i; //5
        ++i; //6
        System.out.println("i = " + i);

        int linesOfCode = 15;
        System.out.println("linesOfCode = " + linesOfCode);
        //increase linesOfCode by 1, 3 different ways that we learnt today
        linesOfCode += 1;
        linesOfCode ++;
        ++linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);

        // TYPE 4 DIFFERENT  ways of decreasing by2

        linesOfCode = linesOfCode - 1;
        linesOfCode -= 1;
        -- linesOfCode;
        linesOfCode --;
        System.out.println("linesOfCode = " + linesOfCode);

        char letter = 'a';
        System.out.println("letter = " + letter);
        letter++;
        ++letter;
        System.out.println("letter = " + letter);
        letter--;
        System.out.println("letter = " + letter);

    }
}
