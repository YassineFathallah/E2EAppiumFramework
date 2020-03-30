package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    AndroidDriver<AndroidElement> driver;

    public HomePage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @AndroidBy(id="com.androidsample.generalstore:id/nameField")
    private WebElement nameField;

    @AndroidBy(id="com.androidsample.generalstore:id/radioFemale")
    public WebElement femaleOption;

    @AndroidBy(id="android:id/text1")
    private WebElement countrySelection;

    @AndroidBy(id="com.androidsample.generalstore:id/btnLetsShop")
    private WebElement letsShopButton;


    public void enterName(String name) {
        nameField.sendKeys(name);
    }

    public void chooseGender() {
        femaleOption.click();
    }

    public void scrollToText(String text) {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));");
    }
}
