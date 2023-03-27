import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CaculatorTest {

    static AppiumDriver<MobileElement> driver;
    public static void main(String[] args){
        try{
            openCaculator();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public static void openCaculator() throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName","Galaxy S10");
//        cap.setCapability("uuid","");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","11");

//        cap.setCapability("appPackage","com.google.android.calculator");
//        cap.setCapability("appActivity","com.android.calculator2.Calculator");
        cap.setCapability("appPackage","com.android.deskclock");
        cap.setCapability("appActivity","com.android.deskclock.DeskClock");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(url,cap);
        System.out.println("App has started...");
//        MobileElement d1 = driver.findElement(By.id("com.google.android.calculator:id/digit_1"));
//        d1.click();
//        driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
//        driver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();
//        driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
//        Thread.sleep(3000);
//        System.out.println(driver.findElement(By.id("com.google.android.calculator:id/result_final")).getText());

    }
}
