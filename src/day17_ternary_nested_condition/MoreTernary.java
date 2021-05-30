package day17_ternary_nested_condition;

public class MoreTernary {

    public static void main(String[] args) {

        int hourlyRate = 40;

        String accepting = (hourlyRate > 45) ? "accept" : "reject";
        System.out.println("accepting = " + accepting);

        String todayTeacher = "java";
        String teacher = (todayTeacher.equals("java")) ? "Murodil" : "Nadir";
        System.out.println("teacher = " + teacher);

        boolean isEligibleDrive = true;
        String driving = (isEligibleDrive) ? "have DL, Can drive" : "No DL, cannot drive";
        System.out.println("driving = " + driving);
    }
}
