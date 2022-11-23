package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class PageController {
    protected WebDriver driver = Driver.getWebDriver();
    protected WebDriverWait wait = new WebDriverWait(driver,20);


    public void clickWebElement(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }


    public void sendKeysToWebElement(WebElement element, String str){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(str);
    }

    public void sendKeysToWebElement(WebElement element, Keys key){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(key);
    }


}
