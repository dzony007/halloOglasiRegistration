package pageHaloOglasi;

import baseHaloOglasi.baseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class mailinatorHalloOglasiEmailPage extends baseTest {
    public mailinatorHalloOglasiEmailPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="html_msg_body")
    WebElement iframeBody;

    @FindBy(css="[align=\"center\"]>a")
    WebElement linkForActivation;

    public void swtichToIframeAndGetLink() {
        wdwait.until(ExpectedConditions.visibilityOf(iframeBody));
        driver.switchTo().frame(iframeBody);
        String linkZaActivaciju = linkForActivation.getAttribute("href");
        driver.get(linkZaActivaciju);
//        driver.get(linkForActivation.getAttribute("href"));
    }
        public void swtichToIframeAndClickLink(){
        wdwait.until(ExpectedConditions.visibilityOf(iframeBody));
        driver.switchTo().frame(iframeBody);
        linkForActivation.click();
    }



}