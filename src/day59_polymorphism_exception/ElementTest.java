package day59_polymorphism_exception;

public class ElementTest {

    public static void main(String[] args) {

        Link link = new Link();
        link.getText();
        link.sendKeys("hi");
        link.click();
        link.getLinkHref();

        WebElement login = new Link();
        login.click();
        String txt = login.getText();
        System.out.println("txt = " + txt);

        WebElement element = new InputField();
        element.sendKeys("wooden spoon");
        element.click();

        WebElementUtil.clickElement(element);
        WebElementUtil.clickElement(login);
        WebElement login2 = WebElementUtil.getLinkWithText("login");
        login2.click();


    }
}
