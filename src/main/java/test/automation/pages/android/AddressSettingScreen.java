package test.automation.pages.android;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;
import test.automation.pageobject.AndroidPageObject;

@Component("test.automation.pages.android.AddressSettingScreen")
public class AddressSettingScreen extends AndroidPageObject {
    private By locationSearchField() {
        return MobileBy.xpath("//android.widget.EditText[@content-desc=\"SearchInput\"]");
    }

    private By resultLocation() {
        return MobileBy.xpath("//android.widget.TextView[@text='Jakarta Pusat']/parent::android.view.ViewGroup");
    }

    private By confirmButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"ConfirmButton\"]");
    }

    public void inputLocation(String location) {
        onType(locationSearchField(), location);
    }

    public void selectLocation() {
        onClick(resultLocation());
        onClick(confirmButton());
    }
}
