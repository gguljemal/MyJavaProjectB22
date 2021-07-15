package myPractices;

import java.util.*;

class IQ_Random_Questions_Mix {
    ArrayList<String> names = new ArrayList<>();

    public IQ_Random_Questions_Mix(String... name) {
        names.addAll(Arrays.asList(name));
    }

    public static void main(String[] args) {

        Random r = new Random();

        ArrayList<String> question = new ArrayList<>();
        question.add("1.What is the difference between JDK,JRE,andJVM?");
        question.add("2.Why is the main method static?");
        question.add("3.What are constructors in Java?");
        question.add("4.Can we execute a program without main()method?");
        question.add("5.What is an object?");
        question.add("6.Object vs Class?");
        question.add("7.What is the difference between stack and heap?");
        question.add("8.Can we overload the constructors?");
        question.add("9.Can we make constructors static?");
        question.add("10.What is the purpose of methods and how are used?");
        question.add("11.Difference between a Constructor and a Method?");
        question.add("12.What is immutable?");
        question.add("13.What is Array?");
        question.add("14.Array vs ArrayList?");
        question.add("15.What are Wrapper classes?");
        question.add("16.Important String Methods?");
        question.add("17.Do you know typecasting? What is casting?");
        question.add("18.AutoBoxing?");
        question.add("19.UnBoxing?");
        question.add("20.What loop types are there and how do they behave?");
        question.add("21.Why is String immutable. What is the String pool?");
        question.add("22.Data types and differences?");
        question.add("23.How can you print from 1 to 100 without using a loop?");
        question.add("24.Difference between methodOverloading and methodOverriding?");
        question.add("25.Can you tell me how to convert a String to an integer and an integer to a String in Java?");
        question.add("26.What is the difference between equals() and == in Java?");
        question.add("27. What are access modifiers in Java? (public, protected, default, private)?");
        question.add("28.What is inheritance in Java?");
        question.add("29.What is the difference between procedure and function?");
        question.add("30. What is unit testing and who does that?");
        question.add("31. what is functional testing?");
        question.add("32. what is unit testing and who does that?");
        question.add("33. What is the difference between regression and retest?");
        question.add("34. What is smoke test?");
        question.add("35. Who runs the smoke test?");
        question.add("36. How long does your smoke test take to run?");
        question.add("37. How many scenarios does your smoke test have?");
        question.add("38. Where do we run smoke test?");
        question.add("39. What is white box testing?");
        question.add("40. What is black box testing?");
        question.add("41. What is difference between TC and TS?");
        question.add("42. Tell me about your project?");
        question.add("43. what you do while developer developing the code?");
        question.add("44. How many environments you have in your project?");
        question.add("45. What are the phases / steps of SDLC/");
        question.add("46. What are the disadvantages of waterfall");
        question.add("47.What do you like about agile?");
        question.add("48.What challenges can you have while working in agile environment?");
        question.add("49.Who accepts user stories?");
        question.add("50.Describe me your team?");
        question.add("51.What do you like about being part of scrum team?");
        question.add("52.What is your team size?");
        question.add("53.What is product backlog?");
        question.add("54.What is sprint backlog?");
        question.add("55.How long is you sprint?");
        question.add("56.Tell me about sprint grooming?");
        question.add("57.Tell me about sprint planning?");
        question.add("58.Tell me about daily stand up?");
        question.add("59.Tell me about retro meeting?");
        question.add("60.How often do you have releases?");
        question.add("61.What is definition of ready?");
        question.add("62.What is definition of done?");
        question.add("63.What is Epic?");
        question.add("64.What is user story?");
        question.add("65.What is AC?");
        question.add("66.What is increment?");
        question.add("67.What is testing?");
        question.add("68.What is manual testing?");
        question.add("69.What is automated testing?");
        question.add("70.What is static testing?");
        question.add("71.What is verification?");
        question.add("72.What is dynamic testing and what is static testing?");
        question.add("73.What is dynamic testing?");
        question.add("74.What is front-end?");
        question.add("75.What is back-end?");
        question.add("76.What is HTML?");
        question.add("77.What is a TAG?");
        question.add("78.How many types of tags we have in HTML?");
        question.add("79.What is a web element?");
        question.add("80.What is automation?");
        question.add("81.How does automating tests help us?");
        question.add("82.What is Selenium?");
        question.add("83.Is Maven for testers?");
        question.add("84.What is Maven?");
        question.add("85.What Java version are you using?");
        question.add("86.What Selenium version are you using?");
        question.add("87.What WebDriverManager version are you using?");
        question.add("88.What is a build?");
        question.add("89.What do we test as testers?");
        question.add("90.What is manual testing?");
        question.add("91.Is maven the only Build automation tool?");
        question.add("92.What 'find.elements' return?");
        question.add("93.What '.getAttribute()' return?");
        question.add("94.What 'find.element' accepts as parameter?");
        question.add("95.When 'NoSuchElementException' is throw?");
        question.add("96.Can you tell me about the common exceptions you are facing when you are using JAVA+SELENIUM?");
        question.add("97.What '.getAttribute() does it do?");
        question.add("98.What is a bite code?");
        question.add("99.HOW TO MOVE FROM PARENT TO CHILD USING CSSSELECTOR?");
        question.add("100.How many types of xpath locators we have?");
        question.add("101.HOW CAN YOU GO FROM CHILD TO PARENT IN XPATH? WHAT ABOUT FORM PARENT TO CHILD?");
        question.add("102.How do we move from parent to ANY CHILD?");
        question.add("103.How do you handle dynamic web elements?");
        question.add("104.How do you handle web elements that has dynamic attribute value?");
        question.add("105.What '.implicitWait()' does do?");
        question.add("106.What is TestNG?");
        question.add("107.What is Assertions on TestNG");
        question.add("108.What is Annotations in TestNG?");
        question.add("109.HOW TO HANDLE DROPDOWNS USING SELENIUM?");
        question.add("110.How many dropDowns in Selenium do you know?");
        question.add("111.How many Select ways are to select from a DROPDOWN?");
        question.add("112.Is TestNG the only unit testing framework?");
        question.add("113.What are the common annotations?");
        question.add("114.How do we select from a <select> dropdown?");
        question.add("115.How do we verify the currently selected option form a DropDown?");
        question.add("116.How to get all of the options from a dropdown?");
        question.add("117What is an iframe?");
        question.add("118.How to get all of the handles of currently opened windows in Selenium?");
        question.add("119.How many different types of alerts are there?");
        question.add("120.How many different type of JS Alert are?");
        question.add("121.How many ways we have to switch to iframes?");
        question.add("122.What is a window handle in Selenium?");
        question.add("123.What is dynamic web element in Selenium?");
        question.add("124.How to move from sibling to sibling in Selenium?");
        question.add("125.HOW DO WE CREATE WEB TABLES IN SELENIUM?");
        question.add("126.HOW DO WE HANDLE WEB TABLES USING SELENIUM?");
        question.add("127.What is hard coding?");
        question.add("128.What is Properties file? What is the type of the Property file?");
        question.add("129.What is Sprint Increment? What about Product Increment?");
        question.add("130.What is the triggering point of your project? Where do you run your project from?");
        question.add("131.What is an exception?"+
                "How can you handle an exception?" +
                "What is the finally?" +
                "    -> final, finally, finalize?" +
                "throw vs throws?" +
                "How are exceptions created and how do they work??");
        question.add("132.Difference between ArrayList and LinkedList?");

        //add more Question in here


        IQ_Random_Questions_Mix players = new IQ_Random_Questions_Mix("Player1", "Player2");  // <-- delete or add more Players in here
        int randomQuestion = r.nextInt(question.size());
        int randomName = r.nextInt(players.names.size());

        System.out.println(players.names.get(randomName) + " -> " + question.get(randomQuestion));
    }
}
