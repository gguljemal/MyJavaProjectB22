package day22_string_manipulation;

public class IndexOfPractice {

    public static void main(String[] args) {

        String technologies = "java, html, css, selenium, testing,maven, cucumber";

        System.out.println(technologies.length());
        System.out.println(technologies.indexOf(","));//4
        System.out.println(technologies.lastIndexOf(","));//40

        int indexOfJava = technologies.indexOf("java");//0
        System.out.println(indexOfJava);

        int indexOfCss = technologies.indexOf("css");
        System.out.println("indexOfCss = " + indexOfCss);//12

        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println("indexOfCucumber = " + indexOfCucumber);//42

        int indexOfSql = technologies.indexOf("sql");
        System.out.println("indexOfSql = " + indexOfSql);//-1 when there is no match

        //technologies contain "maven" ?
        if (technologies.contains("maven")) {
            System.out.println("maven is present");
        } else {
            System.out.println("maven is not present");
        }

        if (technologies.indexOf("maven") > -1) {
            System.out.println("maven is present");
        } else {
            System.out.println("maven is not present");
        }


    }
}
