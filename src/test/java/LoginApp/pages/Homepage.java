package LoginApp.pages;

import net.thucydides.core.annotations.Step;

public class Homepage {

    yourlogohome homePage;

    @Step
    public void openApplication(){
        homePage.open();
    }

    @Step
    public void clicksignin(){
     homePage.clickSignin();

    }




}
