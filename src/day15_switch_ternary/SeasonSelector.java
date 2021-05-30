package day15_switch_ternary;

import java.util.*;

public class SeasonSelector {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char grade = 'A';

        if (grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println("Pass with grade - " + grade);
        }else if(grade == 'D'){
            System.out.println("Qualify for retake. Grade - " + grade);
        }else if (grade == 'F'){
            System.out.println("Fail. Grade - " + grade);
        }else {
            System.out.println("Invalid Grade - " + grade);
        }
    }
}
