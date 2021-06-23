package day55_abstraction.flags;

import java.awt.*;

public class FlagDrawing {

    public static void main(String[] args) {

        Grid grid = new Grid();

//        for (int i = 0; i < grid.getHt(); i++) {
//            grid.setColor(i, 0, Color.GREEN);
//        }

        RussianFlag russianFlag = new RussianFlag();
        russianFlag.draw();

        FrenchFlag frenchFlag = new FrenchFlag();
        frenchFlag.draw();

        UkrainianFlag ukrainianFlag = new UkrainianFlag();
        ukrainianFlag.draw();
    }
}
