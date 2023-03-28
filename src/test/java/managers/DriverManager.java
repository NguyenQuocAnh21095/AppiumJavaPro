package managers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverManager {
    private AppiumDriver<MobileElement> driver;
    Properties prop = new Properties();
    InputStream inputStream = null;

    public AppiumDriver<MobileElement> getDriver() throws IOException {
        if(driver == null) driver = setDriver();
        return driver;
    }
    public AppiumDriver<MobileElement> setDriver() throws IOException {
        inputStream = new FileInputStream("src/main/resources/Configuration.properties");
        prop.load(inputStream);
        String driverType = prop.getProperty("driverType");

        switch (driverType){
            case "Android" : {
                DesiredCapabilities cap = new DesiredCapabilities();
                cap.setCapability("deviceName",prop.getProperty("deviceName"));
//        cap.setCapability("uuid","");
                cap.setCapability("platformName",prop.getProperty("platformName"));
                cap.setCapability("platformVersion",prop.getProperty("platformVersion"));
                cap.setCapability("appPackage",prop.getProperty("appPackage"));
                cap.setCapability("appActivity",prop.getProperty("appActivity"));
                URL url = new URL(prop.getProperty("appiumURL"));
                driver = new AndroidDriver<MobileElement>(url,cap);
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                break;
            }
            case "IOS" : {
                DesiredCapabilities cap = new DesiredCapabilities();
                cap.setCapability("deviceName","Galaxy S10");
//        cap.setCapability("uuid","");
                cap.setCapability("platformName","Android");
                cap.setCapability("platformVersion","11");
                cap.setCapability("appPackage","com.android.deskclock");
                cap.setCapability("appActivity","com.android.deskclock.DeskClock");
                URL url = new URL("http://127.0.0.1:4723/wd/hub");
                driver = new AndroidDriver<MobileElement>(url,cap);
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            }
        }
        return driver;
    }
    public void closeDriver() {
        driver.close();
        driver.quit();
    }
}
