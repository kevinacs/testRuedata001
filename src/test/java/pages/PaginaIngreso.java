package pages;

import static org.junit.Assert.assertEquals;

public class PaginaIngreso extends BasePage {

    private String  expectedUrl = "https://testingbot.com/unconfirmed";

    public PaginaIngreso() {
        super(driver);
    }

    public void verifyHomepageUrl() {
        String actualUrl = driver.getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }

}