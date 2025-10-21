package Util;

import Page.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUntil extends AbstractPage {
    public WaitUntil(WebDriver driver) {
        super(driver);
    }
        public static void waitUntilElementIsDispLayed(WebElement element){
            WebDriverWait webDriverWeit = new WebDriverWait(driver, Duration.ofSeconds(10));
            webDriverWeit.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element.getText())));
        }
        public static void waitUntil(long seconds){
            try{
                Thread.sleep(seconds=1000);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }

}
