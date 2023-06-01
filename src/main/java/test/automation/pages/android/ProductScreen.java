package test.automation.pages.android;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;
import test.automation.pageobject.AndroidPageObject;

@Component("test.automation.pages.android.ProductScreen")
public class ProductScreen extends AndroidPageObject {
    private By title() {
        return By.xpath("//android.widget.TextView[@content-desc='MenuNameText']");
    }

    private By addToCartButton() {
        return By.xpath("//android.view.ViewGroup[@content-desc=\"SubmitButton\"]");
    }

    private By confirmationModal() {
        return By.xpath("//android.view.ViewGroup[@content-desc=\"OrderModal\"]/descendant::android.view.ViewGroup[2]");
    }

    private By tambahkanButton() {
        return By.xpath("//android.view.ViewGroup[@content-desc=\"SubmitButton\"]");
    }

    private By cartModal() {
        return By.xpath("//android.view.ViewGroup[@content-desc=\"FAB\"]");
    }

    public void isOnProductScreen() {
        Assert.assertTrue(waitUntilVisible(title()).isDisplayed());
    }

    public void clickAddToCartButton() {
        onClick(addToCartButton());
    }

    public void isConfirmationModalDisplayed() {
        Assert.assertTrue(waitUntilVisible(confirmationModal()).isDisplayed());
    }

    public void clickTambahkanButton() {
        onClick(tambahkanButton());
    }

    public void clickCartModal() {
        onClick(cartModal());
    }
}
