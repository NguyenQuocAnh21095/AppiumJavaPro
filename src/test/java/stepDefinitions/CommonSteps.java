//package stepDefinitions;
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.ios.IOSDriver;
//import io.cucumber.java.en.And;
//import managers.DriverManager;
//import managers.PageObjectManager;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import pageObjects.AlarmPage;
//import pageObjects.ClockPage;
//
//import java.io.IOException;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class CommonSteps {
//    static AppiumDriver<MobileElement> driver;
//    ClockPage clockPage;
//    AlarmPage alarmPage;
//
//    DriverManager driverManager;
//
//    @And("I open Clock app")
//    public void I_open_Clock_app() throws IOException {
//        driverManager = new DriverManager();
//        driver = driverManager.getDriver();
//        System.out.println("Clock App has started...");
//    }
//
//    @And("I add Amsterdam city clock")
//    public void I_add_amsterdam_city_clock() throws InterruptedException {
//        clockPage = new PageObjectManager(driver).getClockPage();
//        clockPage.add_Amsterdam_clock();
//        clockPage.check_Amsterdam_clock();
//    }
//    @And("I switch to Alarm tab")
//    public void I_switch_to_alarm_tab() throws InterruptedException {
//        alarmPage = new PageObjectManager(driver).getAlarmPage();
//        alarmPage.setAlarm();
//        alarmPage.checkAlarm();
//    }
//}
