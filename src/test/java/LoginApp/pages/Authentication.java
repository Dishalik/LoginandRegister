package LoginApp.pages;

import net.thucydides.core.annotations.Step;

public class Authentication {

    yourlogoauthentication yourauth;

    @Step
    public void verifypage(){

        yourauth.assertPage();
    }

    @Step
    public void enterEmail(){

        yourauth.enterEmail();
    }

    @Step
    public void clickoncreate(){

        yourauth.clickcreate();
    }
}
