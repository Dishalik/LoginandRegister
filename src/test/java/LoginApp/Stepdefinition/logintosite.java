package LoginApp.Stepdefinition;

import LoginApp.pages.Authentication;
import LoginApp.pages.Dashboard;
import LoginApp.pages.Homepage;
import LoginApp.pages.LandingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class logintosite {

    @Steps
    Homepage home;

    @Steps
    Dashboard dash;

    @Steps
    Authentication auth;

    @Steps
    LandingPage landpage;

    //Reached home page and click on Sign-in to enter.

    @Given("user is on home page")
    public void user_is_on_home_page() {
        home.openApplication();

    }

    @Then("user click on Sign in")
    public void userClickOnSignIn() {
        home.clicksignin();
    }
    //Reached authentication page enter email ID and click on Register.

    @When("you reach at authentication page")
    public void you_reach_at_authentication_page() {
        auth.verifypage();
    }
    
    @Then("user enter email")
    public void user_enter_email() {
        auth.enterEmail();
    }

    @And("user click on create account")
    public void userClickOnCreateAccount() throws Throwable {
        auth.clickoncreate();
    }


    @When("you reach at dashboard")
    public void you_reach_at_dashboard() {
        dash.verifyTitle();

    }
    @Then("click on title Mrs")
    public void clickOnTitleMrs() throws Throwable {
        dash.clicktitleMrs();

    }
    @Then("enter details first-name and last-name")
    public void enterDetailsFirstNameAndLastName() throws Throwable {
        dash.enterfirstname();
        dash.enterlastname();

    }
    @Then("enter email and password")
    public void enterEmailAndPassword() throws Throwable {
        dash.enteremail();
        dash.enterpaswd();

    }
    @Then("select date month and year")
    public void selectDateMonthAndYear() throws Throwable {
        dash.enterDOB();
        dash.enterMOB();
        dash.enterYOB();
    }

    @Then("click on sign-up")
    public void clickOnSignUp() throws Throwable {

        dash.clickSignup();

    }

    @Then("click on receive-spl")
    public void clickOnReceiveSpl() throws Throwable {
        dash.clickRceivespl();
    }
    @Then("enter details Name and Surname")
    public void enterDetailsNameAndSurname() throws Throwable {
        dash.enterName();
        dash.enterSurname();

    }
    @Then("enter address and city")
    public void enterAddressAndCity() throws Throwable {
        dash.enterAddress();
        dash.enterCity();
    }

    @Then("select state")
    public void selectState() throws Throwable {
        dash.Selectstate();
    }
    @Then("enter pin-code")
    public void enterPinCode() throws Throwable {
        dash.enterPincode();
    }

    @And("select country")
    public void selectCountry() throws Throwable {
        dash.selectCountry();
    }

    @Then("enter phone number and alias")
    public void enterPhoneNumberAndAlias() throws Throwable {
        dash.enterPhonnum();
        dash.enterAlias();
    }

    @And("click on submit")
    public void clickOnSubmit() throws Throwable {
        dash.clickonSubmit();
    }

    //Reached Landing page and verifying the title of page and correct name.
    @When("reached landing page")
    public void reachedLandingPage() throws Throwable {
        landpage.verifyauthentication();

    }
    @Then("verify full name")
    public void verifyFullName() throws Throwable {
        landpage.verifyFullName();

    }

}
