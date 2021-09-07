package pageHaloOglasi;

import baseHaloOglasi.baseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class haloOglasiRegistrationPage extends baseTest {
    public haloOglasiRegistrationPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(name = "reg-type")
    WebElement fizickoLiceRadioButton;
    @FindBy(id="UserName")
    WebElement koriznickoLiceField;
    @FindBy(id="Email")
    WebElement emailField;
    @FindBy(id="Password")
    WebElement lozinkaField;
    @FindBy(id="ConfirmPassword")
    WebElement ponovilozinkuField;
    @FindBy(id="AllowSendingNewsletters")
    WebElement newsLetterCheckbox;
    @FindBy(css = ".button-reg")
    WebElement registrujMeButton;

    public void selectFizickoLiceRadioButton(){
        wdwait.until(ExpectedConditions.visibilityOf(fizickoLiceRadioButton));
        if (!fizickoLiceRadioButton.isSelected()){
            fizickoLiceRadioButton.click();
        }
    }

    public void inputKorisnickoImeField(String ime){
        wdwait.until(ExpectedConditions.visibilityOf(koriznickoLiceField));
        koriznickoLiceField.clear();
        koriznickoLiceField.sendKeys(ime);
    }

    public void inputEmailField(String email){
        wdwait.until(ExpectedConditions.visibilityOf(emailField));
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void inputLozinkaField(String lozinka){
        wdwait.until(ExpectedConditions.visibilityOf(lozinkaField));
        lozinkaField.clear();
        lozinkaField.sendKeys(lozinka);
    }

    public void inputPonoviLozinkuField(String ponoviLozinku){
        wdwait.until(ExpectedConditions.visibilityOf(ponovilozinkuField));
        ponovilozinkuField.clear();
        ponovilozinkuField.sendKeys(ponoviLozinku);
    }

    public void uncheckNewsLetterCheckbox() {
        wdwait.until(ExpectedConditions.visibilityOf(newsLetterCheckbox));
        if (newsLetterCheckbox.isSelected())
            newsLetterCheckbox.click();
    }

    public void clickRegistrujMeDUgme(){
        wdwait.until(ExpectedConditions.visibilityOf(registrujMeButton));
        registrujMeButton.click();
    }
}
