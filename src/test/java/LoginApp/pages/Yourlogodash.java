package LoginApp.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Yourlogodash extends PageObject {


    public void validatelogin()
    {
        System.out.println(getDriver().getTitle());

    }

    public void clickMrs() {
        $(By.id("id_gender2")).click();
    }

    public void firstname() {
        $(By.id("customer_firstname")).type("Aeeli");

    }

    public void lastname() {
        $(By.id("customer_lastname")).type("Plika");

    }

    public void emailid() {
        $(By.id("email")).type("pilkaeeli@gmail.com");

    }

    public void paswd() {
        $(By.id("passwd")).type("abcd@123");

    }

    public void DOB() {
        WebElement element = $(By.xpath("//*[@id=\"days\"]\n"));
        Select sel = new Select(element);
        sel.selectByValue("12");
        //$(By.id("days")).click();

    }

    public void MOB() {
        WebElement element2 = $(By.xpath("//*[@id=\"months\"]\n"));
        Select sel = new Select(element2);
        sel.selectByValue("7");
        //$(By.id("months")).click();

    }

    public void YOB() {
        WebElement element3 = $(By.xpath("//*[@id=\"years\"]\n"));
        Select sel = new Select(element3);
        sel.selectByValue("1993");
        //$(By.id("years")).click();

    }

    public void clickSignup() {
        $(By.id("uniform-newsletter")).click();

    }

    public void clickRceive() {
        $(By.id("optin")).click();

    }

    public void Name() {
        $(By.id("firstname")).type("Disha");

    }

    public void Surname() {
        $(By.id("lastname")).type("Khilari");

    }

    public void Address() {
        $(By.id("address1")).type("wickham street");

    }

    public void city() {
        $(By.id("city")).type("valley");

    }

    public void State() {
        WebElement state = $(By.xpath("//*[@id=\"id_state\"]\n"));
        Select sel = new Select(state);
        sel.selectByVisibleText("Alaska");

        //$(By.id("id_state")).click();

    }

    public void pincode() {
        $(By.id("postcode")).type("43915");

    }

    public void country() {
        WebElement country = $(By.xpath("//*[@id=\"id_country\"]\n"));
        Select sel = new Select(country);
        sel.selectByVisibleText("United States");
       // $(By.id("id_country")).click();

    }

    public void phonnum() {
        $(By.id("phone_mobile")).type("0412452450");

    }

    public void alias() {
        $(By.id("alias")).type("Dk residency");

    }

    public void submit() {
        $(By.id("submitAccount")).click();

    }
}
