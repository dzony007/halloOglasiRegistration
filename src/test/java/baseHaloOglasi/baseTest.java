package baseHaloOglasi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseTest {

// Uvodjenje promenljivih. To jest dodelili smoim memorijski prostor, ime i tip
    public static WebDriver driver;
    public static WebDriverWait wdwait;

    @Before
    public void setUp() {
// Koristimo Webdriver manager da bi skinuli odgovarajuci Chrome
        WebDriverManager.chromedriver().setup();
//Krecemo inicijalizaciju i dodeljujemo promenljivoj driver konstruktor odnosno instacu objekta Chromedriver
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, 60);
//Otvaramo strnicu koja nam treba
        driver.get("https://www.halooglasi.com/");
    }

    @After
    public void tearDown() {
//        driver.close();
//        driver.quit();
    }
}
