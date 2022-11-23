package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.ebebekProductSAS_Controller;
import utilities.Driver;

public class ebebekProductSASSteps {
    WebDriver driver;
    ebebekProductSAS_Controller pageController = new ebebekProductSAS_Controller();


    @Given("Open the home page")
    public void open_the_home_page() {
        driver = Driver.getWebDriver();
        driver.get("https://www.e-bebek.com/");
        driver.manage().window().maximize();

    }

    @Given("type biberon in the search bar")
    public void type_biberon_in_the_search_bar() {
        pageController.sendKeysToSearchBox("biberon");
    }

    @Then("Search")
    public void search() {
        pageController.sendEnterKeysToSearchBox();
    }


    @Then("Click on first product")
    public void click_on_first_product() {
        pageController.clickTheProductItem();
    }

    @Then("Click the Add to Cart button")
    public void click_the_add_to_cart_button() {

        pageController.clickTheAddChartButton();
    }

    @Then("Click on View Cart button")
    public void click_on_view_cart_button() {
        pageController.clickTheShowChartButton();
    }


    @Then("Check that the product has been added to the cart")
    public void check_that_the_product_has_been_added_to_the_cart() {
            pageController.isProductAdded();
    }
}
