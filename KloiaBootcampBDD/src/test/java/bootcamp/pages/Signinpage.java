package bootcamp.pages;

import bootcamp.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signinpage {
    public Signinpage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(tagName = "h1")
    public WebElement header;

    public void verifyHeader(){
        Assert.assertEquals("Sign In to Best Buy",header.getText());
    }

}
