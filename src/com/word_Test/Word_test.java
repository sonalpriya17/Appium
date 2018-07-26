package src.com.word_Test;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.com.word_pages.wordHome_Page;

import java.net.MalformedURLException;
import java.net.URL;

public class Word_test {

    private AndroidDriver driver;

    public AndroidDriver getDriver(){
        AndroidDriver driver;
        return this.driver;
    }
    @BeforeClass
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

    }

    @Test
    public void testWord() throws InterruptedException {
       wordHome_Page wordHome_page = new wordHome_Page(getDriver());
       wordHome_page.sendName();
       Thread.sleep(3000);
       wordHome_page.clickNext();

    }
}
