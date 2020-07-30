package LoginApp.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class yourlogoauthentication extends PageObject {


    public void assertPage()
    {
     // $(By.className("page-heading"));
      System.out.println(getDriver().getTitle());
    }
    public void enterEmail()
    {
        $(By.id("email_create")).type("aleeli2434@gmail.com");

    }

    public void clickcreate()
    {

        $(By.id("SubmitCreate")).click();
    }
}
