package pageHaloOglasi;

import baseHaloOglasi.baseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class haloOglasiUlogujSePage extends baseTest {
    public haloOglasiUlogujSePage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText = "Registrujte se →")
    WebElement registrujSeLink;

    public void clickRegistrujSeLink(){
        wdwait.until(ExpectedConditions.visibilityOf(registrujSeLink));
        registrujSeLink.click();
    }
}
