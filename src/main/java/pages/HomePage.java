package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By addToCartBtn = By.id("add-to-cart-sauce-labs-backpack");
    private By cartIcon = By.className("shopping_cart_link");

    public void addItemToCart() {
        driver.findElement(addToCartBtn).click();
    }

    public boolean isItemInCart() {
        return driver.findElement(cartIcon).isDisplayed();
    }
}