package day56_abstraction.Greeting;

public class GreetingActions {

    public static void main(String[] args) {

        MountainLanguage language = new MountainLanguage();
        language.bye();
        language.hi();


        Greeting greeting = new MountainLanguage();
        greeting.bye();
        greeting.hi();

        Japanese japanese = new Japanese();
        japanese.bye();
        japanese.hi();

        greeting = new Japanese();
        greeting.bye();
        greeting.hi();
    }
}
