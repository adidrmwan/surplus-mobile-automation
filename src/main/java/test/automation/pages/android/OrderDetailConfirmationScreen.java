package test.automation.pages.android;

import io.appium.java_client.MobileBy;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;
import test.automation.pageobject.AndroidPageObject;

@Component("test.automation.pages.android.OrderDetailConfirmationScreen")
public class OrderDetailConfirmationScreen extends AndroidPageObject {
    private By title() {
        return MobileBy.xpath("//android.view.View[@text='Rincian Pesanan']");
    }

    private By grandTotalReceipt() {
        return MobileBy.xpath("//android.widget.TextView[@text='Grand total']/following-sibling::android.widget.TextView[1]");
    }

    private By paymentMethodReceipt() {
        return MobileBy.xpath("//android.widget.TextView[@text='Metode pembayaran']/following-sibling::android.widget.TextView[1]");
    }

    public void isPaymentConfirmationDisplayed() {
        Assert.assertTrue(waitUntilVisible(title()).isDisplayed());
    }

    public String getTextGrandTotalReceipt() {
        swipeUpIntoElement(grandTotalReceipt());
        String total = waitUntilVisible(grandTotalReceipt()).getText();
        total = total.replaceAll("Rp ", "");
        return total;
    }

    public String getPaymentMethodReceipt() {
        swipeUpIntoElement(paymentMethodReceipt());
        return waitUntilVisible(paymentMethodReceipt()).getText();
    }
}
