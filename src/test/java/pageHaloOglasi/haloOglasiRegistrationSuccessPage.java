package pageHaloOglasi;

import baseHaloOglasi.baseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class haloOglasiRegistrationSuccessPage extends baseTest {
    public haloOglasiRegistrationSuccessPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "regsitration-success")
    WebElement registrationSuccessfulMessage;

    public boolean registrationSuccessfulMessageDisplayed(){
        wdwait.until(ExpectedConditions.visibilityOf(registrationSuccessfulMessage));
        return registrationSuccessfulMessage.isDisplayed();
    }

    public String registrationSuccessfulMessageText(){
        wdwait.until(ExpectedConditions.visibilityOf(registrationSuccessfulMessage));
        return registrationSuccessfulMessage.getText();
    }

    public void moveToNewTab () {
        wdwait.until(ExpectedConditions.numberOfWindowsToBe(2));
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

}
