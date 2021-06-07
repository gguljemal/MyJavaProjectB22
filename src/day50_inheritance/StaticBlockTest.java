package day50_inheritance;

public class StaticBlockTest {

    public static void main(String[] args) {

        //when we use(create object) from the class with static in it, it will run only in first use (object we created)
        // so far, we will not have in second object
        StaticBlockDemo str1 = new StaticBlockDemo(); //----> will print "static initializer block"/ static > constructor
        StaticBlockDemo str2 = new StaticBlockDemo(); //----> will NOT print static, prints ->"constructor method"
        StaticBlockDemo str3 = new StaticBlockDemo(); //--->    prints --> "constructor method"
        System.out.println(StaticBlockDemo.num);  //25
        StaticBlockDemo str4 = new StaticBlockDemo(50);
        System.out.println(StaticBlockDemo.num); //75

    }
}
