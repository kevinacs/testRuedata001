package pages;

public class PaginaLogin extends BasePage {

    private String email = "//input[@id='user_email']";
    private String password = "//input[@id='user_password']";
    private String BtnLogin = "//input[@name='commit']";


    public PaginaLogin() {
        super(driver);
    }

    public void ingresarUsuario(String criteria) {
        write(email, criteria);
    }

    public void ingresarPass(String criteria) {
        write(password, criteria);
    }

    public void ingresarBtnLogin() {
        clickElement(BtnLogin);
    }

}