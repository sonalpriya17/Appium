import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class StartChrome {
    private AndroidDriver driver;
    @Test
    public void test1() throws MalformedURLException, InterruptedException {
      DesiredCapabilities capabilities = DesiredCapabilities.android();

        capabilities.setCapability("platformName","Android");

        capabilities.setCapability("platformVersion","9.0");
        capabilities.setCapability("deviceName","Android_Emulator");
//        capabilities.setCapability("browser_Name","Android");
        capabilities.setCapability("appPackage","org.wordpress.android");
        capabilities.setCapability("appActivity","org.wordpress.android.ui.WPLaunchActivity");
        capabilities.setCapability("udid","emulator-5554");

         driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            Thread.sleep(3000);
         driver.findElementById("org.wordpress.android:id/nux_username").sendKeys("Sonal Priya");
        Thread.sleep(2000);
         driver.findElementById("org.wordpress.android:id/nux_sign_in_button").click();


    }


}
