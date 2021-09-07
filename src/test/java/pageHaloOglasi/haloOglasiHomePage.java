package pageHaloOglasi;

import baseHaloOglasi.baseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class haloOglasiHomePage extends baseTest {

    public haloOglasiHomePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Uloguj se")
    WebElement ulogujSeLink;

    public void clickUlogujSeLink(){
        wdwait.until(ExpectedConditions.visibilityOf(ulogujSeLink));
        ulogujSeLink.click();
    }

}
