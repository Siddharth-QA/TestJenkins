package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class LaunchChrome extends BasePage {


    public void search(){
        driver.findElement(By.xpath("//textarea[@aria-label=\"Search\"]")).sendKeys("CSG TECHNOSOL PVT LTD"+ Keys.ENTER);
        try{
            Thread.sleep(10000);
        }
        catch (Exception e){

        }
    }
    public void launch()  {
        driver.get("https://www.google.com");


    }
}
