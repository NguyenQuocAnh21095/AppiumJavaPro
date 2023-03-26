package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.FieldDecorator;

public class AlarmPage {
    public AlarmPage(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @FindBy(id = "com.android.deskclock:id/fab")
    MobileElement plusIcon;
    @FindBy(xpath = "//android.widget.CheckBox[@content-desc=\"Amsterdam\"]")
    MobileElement AmsterdamCheckBox;
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    MobileElement TopBackIcon;
    @FindBy(id = "com.android.deskclock:id/city_name")
    MobileElement CityName;
    @FindBy(id = "com.android.deskclock:id/hours_ahead")
    MobileElement HourAhead;

    public void add_Amsterdam_clock(){
        plusIcon.click();
        AmsterdamCheckBox.click();
        TopBackIcon.click();
    }

    public void check_Amsterdam_clock(){
        Assert.assertEquals("Amsterdam",CityName.getText());
        Assert.assertEquals("5 hours behind",CityName.getText());
    }
}
