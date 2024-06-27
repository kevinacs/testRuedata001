package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FreeTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        //Inicializar webdriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void goToGoogle(){
        driver.get("https://testingbot.com/");
    }

    @AfterMethod
    public void tearDown(){
        //Cierra navegador
        if (driver != null){
            driver.quit();
        }
    }
}
