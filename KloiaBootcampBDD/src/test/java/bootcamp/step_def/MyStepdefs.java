package bootcamp.step_def;

import bootcamp.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    Homepage homepage = new Homepage();
    SearchResultPage searchResultPage = new SearchResultPage();
    Signinpage signinpage = new Signinpage();
    CreditCardPage creditCardPage = new CreditCardPage();
    CardApplicationPage cardApplicationPage = new CardApplicationPage();

    @Given("homepage is open")
    public void homepageIsOpen() {
        homepage.chooseUS();
    }

    @When("I close the pop up")
    public void ıCloseThePopUp() {
        homepage.closePopUp();
    }

    @Then("logo should be displayed")
    public void logoShouldBeDisplayed() {
        homepage.verifyLogo();
    }

    @When("I search for {string}")
    public void ıSearchFor(String search) {
        homepage.searchFor(search);
    }

    @Then("search result {string} should be seen")
    public void searchResultShouldBeSeen(String search) {
        searchResultPage.verifySearchFor(search);
    }

    @And("I open the {string} dropdown menu")
    public void ıOpenTheDropdownMenu(String section) {
        homepage.openDropdown(section);
    }

    @When("I choose {string} submenu")
    public void ıChooseSubmenu(String submenu) {
        homepage.openSubmenu(submenu);
    }

    @Then("sign in page should open")
    public void signInPageShouldOpen() {
        signinpage.verifyHeader();
    }

    @When("I open my best buy credit card page")
    public void ıOpenMyBestBuyCreditCardPage() {
        homepage.openMyCreditCardPage();
    }

    @And("I open application page")
    public void ıOpenApplicationPage() {
        creditCardPage.openApplyPage();
    }

    @Then("application page should be open")
    public void applicationPageShouldBeOpen() {
        cardApplicationPage.verifyTitle();
    }
}
