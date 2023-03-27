package managers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import pageObjects.AlarmPage;
import pageObjects.ClockPage;

public class PageObjectManager {
    private AppiumDriver<MobileElement> driver;
    private ClockPage clockPage;
    private AlarmPage alarmPage;

    public PageObjectManager(AppiumDriver<MobileElement> driver) {

        this.driver = driver;
    }



    public ClockPage getClockPage(){

        return (clockPage == null) ? clockPage = new ClockPage(driver) : clockPage;

    }
    public AlarmPage getAlarmPage(){

        return (alarmPage == null) ? alarmPage = new AlarmPage(driver) : alarmPage;

    }

}
