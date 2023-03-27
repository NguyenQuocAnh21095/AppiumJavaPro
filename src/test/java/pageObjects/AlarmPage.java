package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//androidx.appcompat.app.ActionBar.Tab[@content-desc="Alarm"]/android.widget.TextView
public class AlarmPage {
    public AlarmPage(AppiumDriver<MobileElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @FindBy(xpath = "//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Alarm\"]/android.widget.TextView")
    MobileElement AlarmTab;
    @FindBy(id = "com.android.deskclock:id/fab")
    MobileElement PlusIcon;
    @FindBy(xpath = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"6\"]")
    MobileElement Sixhour;
    @FindBy(xpath = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"30\"]")
    MobileElement ThirtyMins;
    @FindBy(id = "android:id/am_label")
    MobileElement AM;
    @FindBy(id = "android:id/button1")
    MobileElement OKButton;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"6:30 AM\"]")
    MobileElement SixFortyAM;

    public void setAlarm() throws InterruptedException {
        Thread.sleep(3000);
        AlarmTab.click();
        Thread.sleep(3000);
        PlusIcon.click();
        Thread.sleep(3000);
        Sixhour.click();
        Thread.sleep(3000);
        ThirtyMins.click();
        Thread.sleep(3000);
        AM.click();
        Thread.sleep(3000);
        OKButton.click();
    }
    public void checkAlarm() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals("6:30 AM",SixFortyAM.getText());
    }
}
