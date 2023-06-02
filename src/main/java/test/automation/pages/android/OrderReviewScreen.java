package test.automation.pages.android;

import io.appium.java_client.MobileBy;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;
import test.automation.pageobject.AndroidPageObject;

@Component("test.automation.pages.android.OrderReviewScreen")
public class OrderReviewScreen extends AndroidPageObject {
    private By title() {
        return MobileBy.xpath("//android.view.View[@text=\"Atur pesanan\"]");
    }

    private By selfPickUpButton() {
        return MobileBy.xpath("(//android.widget.TextView[@text=\"Ambil Sendiri\"]/parent::android.view.ViewGroup)[1]");
    }

    private By deliveryButton() {
        return MobileBy.xpath("(//android.widget.TextView[@text=\"Dikirim\"]/parent::android.view.ViewGroup)[1]");
    }

    private By submitOrderButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"SubmitOrderButton\"]");
    }

    private By grandTotal() {
        return MobileBy.xpath("//android.widget.TextView[@text='Grand total']/following-sibling::android.widget.TextView[2]");
    }

    private By loadingModal() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"LoadingModal\"]/android.view.ViewGroup");
    }

    public void isOnOrderReviewScreen() {
        Assert.assertTrue(waitUntilVisible(title()).isDisplayed());
    }

    public void selectPickUpButton(String type) {
        if (type.equals("delivery")) {
            onClick(deliveryButton());
        } else {
            onClick(selfPickUpButton());
        }
    }

    public void clickSubmitOrderButton() {
        onClick(submitOrderButton());
    }

    public String getTotalPaymentOrder() throws InterruptedException {
        Thread.sleep(2000);
        String total = waitUntilVisible(grandTotal()).getText();
        total = total.replace("Rp", "");
        return total;
    }
}
