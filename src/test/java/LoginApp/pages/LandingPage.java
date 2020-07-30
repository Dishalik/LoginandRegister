package LoginApp.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class LandingPage {

    Yourlogolandingpage yourlandpage;

    @Step
    public void verifyauthentication(){
        yourlandpage.validatelandignpage();
    }

    @Step
    public void verifyFullName(){
     yourlandpage.verifyCoreectname();


    }
}
