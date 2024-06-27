package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PaginaIngreso;
import pages.PaginaPrincipal;
import pages.PaginaLogin;

public class TestingSteps {
    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaLogin registro = new PaginaLogin();
    PaginaIngreso home = new PaginaIngreso();

    @Given("User is on the login page")
    public void iNavigateToHP() {
        landingPage.navigateToTestingPage();
        landingPage.clickOnLogIn();
    }

    /*@When("User enters valid username and password")
    public void the_user_enters_valid_credentials() {
        registro.ingresarUsuario("testruedata@Ruedatatest.com");
        registro.ingresarPass("Compu123.");
    }*/

    @When("^User enters username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_enters_username_and_password(String username, String password) {
        registro.ingresarUsuario(username);
        registro.ingresarPass(password);
    }

    @And("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
        registro.ingresarBtnLogin();
    }


    @Then("^User is redirected to the homepage$")
    public void user_is_redirected_to_the_homepage() {
        home.verifyHomepageUrl();
    }
}
