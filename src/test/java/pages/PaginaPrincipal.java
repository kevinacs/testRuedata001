package pages;

public class PaginaPrincipal extends BasePage {

    private String ButtonLogIn = "//a[@class='navigation-link']";

    public PaginaPrincipal() {
        super(driver);
    }

    // Método para navegar a https://testingbot.com/
    public void navigateToTestingPage() {
        navigateTo("https://testingbot.com/");

    }

    public void clickOnLogIn() {
        clickElement(ButtonLogIn);
    }
}