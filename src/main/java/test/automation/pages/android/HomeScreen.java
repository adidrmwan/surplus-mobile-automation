package test.automation.pages.android;

import io.appium.java_client.MobileBy;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;
import test.automation.pageobject.AndroidPageObject;

@Component("test.automation.pages.android.HomeScreen")
public class HomeScreen extends AndroidPageObject {
    private By title() {
        return MobileBy.xpath("//android.widget.TextView[@content-desc='GreetingText']");
    }

    private By jaminanBanner() {
        return MobileBy.xpath("//android.widget.TextView[@text='Jaminan Surplus']");
    }

    private By confirmBannerButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc='ConfirmButton']");
    }

    private By locationButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"LocationButton\"]");
    }

    private By nearbyMenuListText() {
        return MobileBy.xpath("//android.widget.TextView[@content-desc='NearbyMenuListText']");
    }

    private By bestSellerMenuListText() {
        return MobileBy.xpath("//android.widget.TextView[@content-desc=\"BestsellerMenuListText\"]");
    }

    private By product() {
        return MobileBy.xpath("(//android.view.ViewGroup[@content-desc='BestsellerMenuListItem'])[1]");
    }

    private By loadingModal() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"LoadingModal\"]/android.view.ViewGroup");
    }

    public void isOnHomeScreen(){
        Assert.assertTrue(waitUntilVisible(title()).isDisplayed());
    }

    public void closeJaminanBanner() {
        boolean elem = waitUntilVisible(jaminanBanner()).isDisplayed();
        if (elem == true) {
            onClick(confirmBannerButton());
        }
    }

    public void clickLocationButton() {
        onClick(locationButton());
    }

    public void selectProduct() {
//        int i = 0;
//        do {
//            swipe(PointOption.point(500, 1650), PointOption.point(500, 200));
//            i++;
//        }
//        while (!isElementDisplayed(bestSellerMenuListText(), 1) && i< 5);
        swipeUpIntoElement(bestSellerMenuListText());

        onClick(product());
    }

}
