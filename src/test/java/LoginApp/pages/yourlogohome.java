package LoginApp.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class yourlogohome extends PageObject {


    WebDriver driver;
    
    public void clickSignin() {
        //driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
       // driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);

       $(By.className("login")).click();


    }



}
