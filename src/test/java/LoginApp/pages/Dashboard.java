package LoginApp.pages;

import net.thucydides.core.annotations.Step;

public class Dashboard {

    Yourlogodash dashboard;

    @Step
    public void verifyTitle(){
        
        dashboard.validatelogin();
    }

    @Step
    public void clicktitleMrs(){
        
        dashboard.clickMrs();
    }

    @Step
    public void enterfirstname(){
        
        dashboard.firstname();
    }
    @Step
    public void enterlastname(){
        dashboard.lastname();

    }
    @Step
    public void enteremail(){
        dashboard.emailid();

    }

    @Step
    public void enterpaswd(){
        
        dashboard.paswd();
    }

    @Step
    public void enterDOB(){
        dashboard.DOB();

    }

    @Step
    public void enterMOB(){
        dashboard.MOB();

    }

    @Step
    public void enterYOB(){
        dashboard.YOB();

    }

    @Step
    public void clickSignup(){

        dashboard.clickSignup();
    }

    @Step
    public void clickRceivespl(){

        dashboard.clickRceive();
    }

    @Step
    public void enterName(){
        dashboard.Name();
    }

    @Step
    public void enterSurname(){
        dashboard.Surname();
    }

    @Step
    public void enterAddress(){
        dashboard.Address();
    }

    @Step
    public void enterCity(){
        dashboard.city();
    }

    @Step
    public void Selectstate(){
        dashboard.State();
    }

    @Step
    public void enterPincode(){
        dashboard.pincode();
    }

    @Step
    public void selectCountry(){
        dashboard.country();
    }

    @Step
    public void enterPhonnum(){
        dashboard.phonnum();

    }

    @Step
    public void enterAlias(){
        dashboard.alias();
    }

    @Step
    public void clickonSubmit(){
        dashboard.submit();

    }

}
