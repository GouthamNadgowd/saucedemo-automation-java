package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginAndAddToCart() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.login("standard_user", "secret_sauce");
        homePage.addItemToCart();

        Assert.assertTrue(homePage.isItemInCart(), "Item was not added to cart.");
    }
}