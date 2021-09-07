package testHaloOglasi;

import baseHaloOglasi.baseTest;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import pageHaloOglasi.*;

import java.util.Random;

public class haloOglasiRegistrationTests extends baseTest {

    haloOglasiHomePage HaloOglasiHomePage;
    haloOglasiRegistrationPage HaloOglasiRegistrationPage;
    haloOglasiRegistrationSuccessPage HaloOglasiRegistrationSuccessPage;
    haloOglasiUlogujSePage HaloOglasiUlogujSePage;
    mailinatorInboxPage MailinatorInboxPage;
    mailinatorHomePage MailinatorHomePage;
    mailinatorHalloOglasiEmailPage MailinatorHalloOglasiEmailPage;
    Random ran = new Random();
    int x = ran.nextInt(99999);
    String ime = "jaSamQA" + x;
    String mailinatorDomain = "@mailinator.com";
    String lozinka = "12345678";
    String mailinator = "https://www.mailinator.com/";




    @Before
    public void setUpTest(){
        HaloOglasiHomePage = new haloOglasiHomePage();
        HaloOglasiRegistrationPage = new haloOglasiRegistrationPage();
        HaloOglasiRegistrationSuccessPage = new haloOglasiRegistrationSuccessPage();
        HaloOglasiUlogujSePage = new haloOglasiUlogujSePage();
        MailinatorInboxPage = new mailinatorInboxPage();
        MailinatorHomePage = new mailinatorHomePage();
        MailinatorHalloOglasiEmailPage = new mailinatorHalloOglasiEmailPage();


    }
    @Test
    public void haloOglasiSuccessfulRegistrationTestWithoutClickingActivationLink(){
    HaloOglasiHomePage.clickUlogujSeLink();
    HaloOglasiUlogujSePage.clickRegistrujSeLink();
    HaloOglasiRegistrationPage.selectFizickoLiceRadioButton();
    HaloOglasiRegistrationPage.inputKorisnickoImeField(ime);
    HaloOglasiRegistrationPage.inputEmailField(ime+mailinatorDomain);
    HaloOglasiRegistrationPage.inputLozinkaField(lozinka);
    HaloOglasiRegistrationPage.inputPonoviLozinkuField(lozinka);
    HaloOglasiRegistrationPage.uncheckNewsLetterCheckbox();
    HaloOglasiRegistrationPage.clickRegistrujMeDUgme();
    assertTrue(HaloOglasiRegistrationSuccessPage.registrationSuccessfulMessageDisplayed());
    assertEquals("Registracija je uspela!\n" +
            "Kako bi Vaš nalog postao aktivan, neophodno je da kliknite na link u mejlu koji " +
            "Vam je poslat na : " + ime + mailinatorDomain + " !", HaloOglasiRegistrationSuccessPage.registrationSuccessfulMessageText());

    driver.get(mailinator);
    MailinatorHomePage.inputMailinatorInputField(ime);
    MailinatorHomePage.inputEnterMailinatorInputField();
    MailinatorInboxPage.clickHaloOglasiEmail();
    MailinatorHalloOglasiEmailPage.swtichToIframeAndGetLink();
    assertTrue(HaloOglasiRegistrationSuccessPage.registrationSuccessfulMessageDisplayed());
    assertEquals("Vaš nalog je uspešno aktiviran!\n" +
            "Produžite na stranicu za logovanje kako biste pristupili našem portalu. Prijava", HaloOglasiRegistrationSuccessPage.registrationSuccessfulMessageText());

    }

    @Test
    public void haloOglasiSuccessfulRegistrationTestWithClickingActivationLink(){
    HaloOglasiHomePage.clickUlogujSeLink();
    HaloOglasiUlogujSePage.clickRegistrujSeLink();
    HaloOglasiRegistrationPage.selectFizickoLiceRadioButton();
    HaloOglasiRegistrationPage.inputKorisnickoImeField(ime);
    HaloOglasiRegistrationPage.inputEmailField(ime+mailinatorDomain);
    HaloOglasiRegistrationPage.inputLozinkaField(lozinka);
    HaloOglasiRegistrationPage.inputPonoviLozinkuField(lozinka);
    HaloOglasiRegistrationPage.uncheckNewsLetterCheckbox();
    HaloOglasiRegistrationPage.clickRegistrujMeDUgme();
    assertTrue(HaloOglasiRegistrationSuccessPage.registrationSuccessfulMessageDisplayed());
    assertEquals("Registracija je uspela!\n" +
            "Kako bi Vaš nalog postao aktivan, neophodno je da kliknite na link u mejlu koji " +
            "Vam je poslat na : " + ime + mailinatorDomain + " !", HaloOglasiRegistrationSuccessPage.registrationSuccessfulMessageText());

    driver.get(mailinator);
    MailinatorHomePage.inputMailinatorInputField(ime);
    MailinatorHomePage.inputEnterMailinatorInputField();
    MailinatorInboxPage.clickHaloOglasiEmail();
    MailinatorHalloOglasiEmailPage.swtichToIframeAndClickLink();
    HaloOglasiRegistrationSuccessPage.moveToNewTab();
    assertTrue(HaloOglasiRegistrationSuccessPage.registrationSuccessfulMessageDisplayed());
    assertEquals("Vaš nalog je uspešno aktiviran!\n" +
            "Produžite na stranicu za logovanje kako biste pristupili našem portalu. Prijava", HaloOglasiRegistrationSuccessPage.registrationSuccessfulMessageText());

    }


}
