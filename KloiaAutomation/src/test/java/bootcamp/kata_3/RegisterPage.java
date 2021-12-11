package bootcamp.kata_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    public RegisterPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstName")
    public WebElement firstname;

    @FindBy(id = "lastName")
    public WebElement lastname;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "fld-p1")
    public WebElement password;

    @FindBy(id = "reenterPassword")
    public WebElement repassword;

    @FindBy(id = "phone")
    public WebElement phone;

    @FindBy(css = ".cia-form__controls button")
    public WebElement createAccountButton;

}
