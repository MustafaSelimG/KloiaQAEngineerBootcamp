package bootcamp.kata_3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class POMtests {
    WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.bestbuy.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void teardown(){
        driver.quit();
    }


    @Test
    public void test(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);

        homePage.countryIcon.click();
        homePage.closeButton.click();
        homePage.accountMenu.click();
        homePage.createAccount.click();

        registerPage.firstname.sendKeys("example");
        registerPage.lastname.sendKeys("first");
        registerPage.email.sendKeys("qwerty1234asdef@gmail.com");
        registerPage.password.sendKeys("qwerty12345");
        registerPage.repassword.sendKeys("qwerty12345");
        registerPage.phone.sendKeys("5369552313");
        registerPage.createAccountButton.click();
    }


}
