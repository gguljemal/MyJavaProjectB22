package day55_abstraction.interface_demo;

public class DriverObjects {

    public static void main(String[] args) {

        ChromeDriver driver1 = new ChromeDriver();
        FirefoxDriver driver2 = new FirefoxDriver();
        WebDriver driver3 = new ChromeDriver();

        driver1.get("https://www.google.com");
        driver1.findElement("//input[@name='q']");
        System.out.println("driver1 = " + driver1.getTitle());
    }
}
