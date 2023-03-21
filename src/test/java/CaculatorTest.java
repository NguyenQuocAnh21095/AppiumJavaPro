import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.swing.text.html.parser.Element;
import java.net.MalformedURLException;
import java.net.URL;

public class CaculatorTest {

    static AppiumDriver driver;
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
//        cap.setCapability("ip","192.168.56.101");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","11");

        cap.setCapability("appPackage","com.google.android.calculator");
        cap.setCapability("appActivity","com.android.calculator2.Calculator");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver(url,cap);
        System.out.println("App has started...");

        driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();
        driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();
        driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.id("com.google.android.calculator:id/result_final")).getText());

    }
}
