package LoginApp.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Yourlogolandingpage extends PageObject {


    public void validatelandignpage()
    {
        System.out.println(getDriver().getTitle());

    }

    public void verifyCoreectname(){

        WebElement element = $(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a/span\n"));

        //verify if Correct name is displayed
        if(element.isDisplayed())
        {
            System.out.println("Account name is Displayed!!");
        }
        else
        {
            System.out.println("Account name is not Displayed!!");
        }

        //Validating the account name

        String expected = " Dishali Khilari";
        String actual = element.getText();

        //comparing the text
        if(actual.equals(expected))
        {
            System.out.println("Account name is Correct!!" + actual);
        }
        else
        {
            System.out.println("Account name is not Correct-->>" + actual);
        }


    }
}
