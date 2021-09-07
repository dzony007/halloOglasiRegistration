package pageHaloOglasi;

import baseHaloOglasi.baseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class mailinatorInboxPage extends baseTest {
    public mailinatorInboxPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//td[contains(text(), \"Molimo aktivirajte Vaš Halo\")]")
    WebElement haloOglasiEmail;

    public void clickHaloOglasiEmail(){
        wdwait.until(ExpectedConditions.visibilityOf(haloOglasiEmail));
        haloOglasiEmail.click();
        }

    }

