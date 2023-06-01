package test.automation.stepdefinitions.android;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import test.automation.pages.android.HomeScreen;
import test.automation.pages.android.ProductScreen;

public class ProductSteps {
    @Autowired
    HomeScreen homeScreen;

    @Autowired
    ProductScreen productScreen;

    @When("user select product on best seller menu")
    public void userSelectProductOnBestSellerMenu() {
        homeScreen.selectProduct();
        productScreen.isOnProductScreen();
        productScreen.clickAddToCartButton();
        productScreen.isConfirmationModalDisplayed();
        productScreen.clickTambahkanButton();
        productScreen.clickCartModal();
    }
}
