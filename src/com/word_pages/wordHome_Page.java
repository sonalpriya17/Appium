package src.com.word_pages;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class wordHome_Page {
    AndroidDriver driver;
    public wordHome_Page(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);

    }

    @AndroidFindBy(id = "org.wordpress.android:id/nux_username")
    public WebElement textBox;

    @AndroidFindBy(id="org.wordpress.android:id/nux_sign_in_button")
    public WebElement nextButton;





    public void
    sendName(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        textBox.sendKeys("Sonal Priya");
    }
    public void clickNext(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            nextButton.click();
        } catch (Exception e) {
            nextButton.submit();
        }
    }



}
