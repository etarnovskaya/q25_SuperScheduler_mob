package com.inetex.scheduler.manager;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    AppiumDriver driver;
    DesiredCapabilities caps;
    UserHelper user;
    EventsHelper events;

    public void init() throws MalformedURLException {
        caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "8.0");
        caps.setCapability("deviceName", "qa25_mob");
        caps.setCapability("automationName", "Appium");

        caps.setCapability("appPackage", "com.example.svetlana.scheduler");
        caps.setCapability("appActivity", "presentation.splashScreen.SplashScreenActivity");
        caps.setCapability("app",
                "C:\\Users\\Elena\\Dropbox\\Tel-ran\\Mobile\\Grisha\\SuperScheduler\\v.0.0.3.apk");



        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        user = new UserHelper(driver);
        events = new EventsHelper(driver);
    }

    public UserHelper user() {
        return user;
    }

    public EventsHelper event() {
        return events;
    }

    public void stop() {
        driver.quit();
    }
}
