package pageHaloOglasi;

import baseHaloOglasi.baseTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class mailinatorHomePage extends baseTest {
    public mailinatorHomePage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="addOverlay")
    WebElement mailinatorInputField;

    public void inputMailinatorInputField(String email){
        wdwait.until(ExpectedConditions.visibilityOf(mailinatorInputField));
        mailinatorInputField.clear();
        mailinatorInputField.sendKeys(email);
    }

    public void inputEnterMailinatorInputField(){
        wdwait.until(ExpectedConditions.visibilityOf(mailinatorInputField));
        mailinatorInputField.sendKeys(Keys.ENTER);
    }

}
