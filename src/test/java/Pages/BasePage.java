package Pages;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {


    public static WebDriver driver;
    public static void initializeBrowser(){
            driver = new ChromeDriver();
    }
    public static void quitBrowser(){
        driver.quit();
    }
}
