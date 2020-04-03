package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AdminHomePage;
import step_definitions.step_impl.AdminHomePage_Impl;
import utils.ConfigReader;
import utils.Driver;

public class AdminHomePage_STEPS {

    AdminHomePage admin = new AdminHomePage();
    AdminHomePage_Impl adminHomePage = new AdminHomePage_Impl();

    @Given("User opens {string} page")
    public void user_opens_page(String string) {
        adminHomePage.navigateToPage(string);
    }

    @When("User logins to admin page")
    public void user_logins_to_admin_page() {
        adminHomePage.logIn();
    }

    @Then("Verifies title is {string}")
    public void verifies_title_is(String string) {
        Assert.assertEquals(string,Driver.getDriver().getTitle());
    }

    @When("User logs out from admin page")
    public void user_logs_out_from_admin_page(){
        adminHomePage.logOut();
    }

    @Then("Verifies the text {string}")
    public void verifies_the_text(String string) {
        Assert.assertTrue(adminHomePage.verifyText(string));
    }
}
