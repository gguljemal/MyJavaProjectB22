package day34_void_method;

public class EtsySearchTest {

    public static void main(String[] args) {

        System.out.println("---Starting Etsy Search Smoke Test---");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsDisplayed();

    }

    public static void openBrowser() {
        System.out.println("Launching Chrome browser");
    }

    public static void navigateToEtsyUrl() {
        System.out.println(" Navigating to https://www.etsy.com/");
    }

    public static void searchForWoodenSpoon() {
        System.out.println("PASS: Verify Etsy home page is displayed");
        System.out.println("Type 'Wooden spoon' in search field and click search");
    }

    public static void verifyResultsDisplayed() {
        System.out.println("PASS: Search results are successfully displayed");
    }
}
