package test.automation.stepdefinitions.android;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import test.automation.data.PaymentData;
import test.automation.pages.android.OrderDetailConfirmationScreen;
import test.automation.pages.android.OrderReviewScreen;
import test.automation.pages.android.PaymentScreen;

public class TransactionSteps {
    @Autowired
    OrderReviewScreen orderReviewScreen;

    @Autowired
    PaymentScreen paymentScreen;

    @Autowired
    OrderDetailConfirmationScreen orderDetailConfirmationScreen;

    @And("user select {string} pickup method")
    public void userSelectSelfPickupMethod(String type) throws InterruptedException {
        orderReviewScreen.isOnOrderReviewScreen();
        orderReviewScreen.selectPickUpButton(type);
        PaymentData.setGrandTotal(orderReviewScreen.getTotalPaymentOrder());
        orderReviewScreen.clickSubmitOrderButton();
    }

    @And("user select {string} payment method with phone {string}")
    public void userSelectPaymentMethod(String type, String number) {
        paymentScreen.isOnPembarayanScreen();
        paymentScreen.selectPaymentMethod(type, number);
        Assert.assertEquals(PaymentData.getGrandTotal(), paymentScreen.getGrandTotalPayment());
        paymentScreen.clickSubmitOrderButton();
    }

    @Then("user see payment confirmation detail")
    public void userSeePaymentConfirmation() {
        orderDetailConfirmationScreen.isPaymentConfirmationDisplayed();
    }

    @And("user see order detail confirmation with {string} payment method")
    public void userSeeOrderDetailConfirmationWithPaymentMethod(String type) {
        Assert.assertTrue(orderDetailConfirmationScreen.isPaymentMethodReceiptContains(type));
        Assert.assertEquals(PaymentData.getGrandTotal(), orderDetailConfirmationScreen.getTextGrandTotalReceipt());
    }
}
