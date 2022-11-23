package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.Driver;

public class ebebekProductSAS_Controller extends PageController{


    public ebebekProductSAS_Controller(){
        PageFactory.initElements(driver,this);
    }



    @FindBy(id = "txtSearchBox")
    private WebElement searchBoxWebElement;

    public void sendKeysToSearchBox(String str){
        sendKeysToWebElement(searchBoxWebElement,str);
    }

    public void sendEnterKeysToSearchBox(){
        sendKeysToWebElement(searchBoxWebElement,Keys.ENTER);
    }


    @FindBy(xpath = "//div/eb-product-list-item[1]/div")
    private WebElement productItemWebElement;
    String productLink;

    public void  clickTheProductItem(){
        clickWebElement(productItemWebElement);
        productLink = productItemWebElement.findElement(By.tagName("eb-generic-link")).findElement(By.tagName("a")).getAttribute("href");
    }


    @FindBy(id = "addToCartBtn")
    private  WebElement addToCartButtonWebElement;

    public void clickTheAddChartButton(){
        clickWebElement(addToCartButtonWebElement);
    }



    @FindBy(id = "btnShowCart")
    private WebElement showChartButtonWebElement;

    public  void clickTheShowChartButton(){
        clickWebElement(showChartButtonWebElement);
    }


    @FindBy(xpath = "//eb-cart-item/div")  ////eb-cart-item/div/div[1]/span/a
    private WebElement productInTheChartWebElement;

    public void isProductAdded(){
        wait.until(ExpectedConditions.visibilityOf(productInTheChartWebElement));
        String productLınkInTheBasket = productInTheChartWebElement.findElements(By.tagName("div")).get(0).findElement(By.tagName("span")).findElement(By.tagName("a")).getAttribute("href");

        if(productLink.equals(productLınkInTheBasket))
            System.out.println("DOGRU URUN BASARI ILE EKLENDİ");
        else
            System.out.println("HATA");

        //driver.quit();

    }

}
