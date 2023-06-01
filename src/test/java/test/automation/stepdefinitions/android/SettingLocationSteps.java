package test.automation.stepdefinitions.android;

import io.cucumber.java.en.And;
import org.springframework.beans.factory.annotation.Autowired;
import test.automation.pages.android.AddressSettingScreen;
import test.automation.pages.android.HomeScreen;

public class SettingLocationSteps {
    @Autowired
    AddressSettingScreen addressSettingScreen;

    @Autowired
    HomeScreen homeScreen;

    @And("user setting current location")
    public void userSettingCurrentLocation() {
        homeScreen.clickLocationButton();
        addressSettingScreen.inputLocation("Jakarta Pusat");
        addressSettingScreen.selectLocation();
    }
}
