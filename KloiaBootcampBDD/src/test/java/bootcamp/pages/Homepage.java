package bootcamp.pages;

import bootcamp.utils.Driver;
import bootcamp.utils.Helper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
    public Homepage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = "[alt='United States']")
    public WebElement country;

    @FindBy(css = ".c-close-icon.c-modal-close-icon")
    public WebElement popUpCloseButton;

    @FindBy(className = "logo")
    public WebElement bestBuyLogo;

    @FindBy(id = "gh-search-input")
    public WebElement searchBar;

    @FindBy(className = "header-search-button")
    public WebElement searchButton;

    @FindBy(css = "a.btn.btn-white.btn-sm")
    public WebElement learnMoreButton;

    public void chooseUS(){
        country.click();
    }

    public void closePopUp(){
        popUpCloseButton.click();
    }

    public void verifyLogo(){
        Assert.assertTrue(bestBuyLogo.isDisplayed());
    }

    public void searchFor(String search){
        searchBar.click();
        searchBar.sendKeys(search);
        searchButton.click();
    }

    public void openDropdown(String section) {
        String locator = "//span[text()='"+section+"']";
        Driver.get().findElement(By.xpath(locator)).click();
    }

    public void openSubmenu(String submenu) {
        Helper.clickWithLinkText(submenu);
    }

    public void openMyCreditCardPage(){
        learnMoreButton.click();
    }

}
