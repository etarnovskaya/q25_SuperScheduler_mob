import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class UserHelper extends HelperBase {
    public UserHelper(AppiumDriver driver) {
        super(driver);
    }

    public void login(String email, String password) {
        type(By.xpath("//*[@resource-id='com.example.svetlana.scheduler:id/log_email_input']"), email);
        type(By.xpath("//*[@resource-id='com.example.svetlana.scheduler:id/log_password_input']"), password);
        driver.hideKeyboard();

        driver.findElement(By.id("login_btn")).click();
    }
}
