package com.inetex.scheduler.manager;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class EventsHelper extends HelperBase {
    public EventsHelper(AppiumDriver driver) {
        super(driver);
    }

    public boolean isIconReportPresent() {
        return isElementPresent
                (By.xpath("//*[@resource-id='com.example.svetlana.scheduler:id/nav_list_fr_fab_container']"));
    }

    public void initCreation() {
        tap(By.xpath("//*[@resource-id='com.example.svetlana.scheduler:id/fab_main']"));
    }

    public void tapOnPecillButton() {
        tap(By.id("fab_add_event"));
    }

    public void fillCreationForm(String eventTitle) {
        swipeRightToLeft();
        type(By.id("info_title_input"), eventTitle);
        hideKeyboard();
    }

    public void save() {
        tap(By.id("info_save_btn"));
    }

    public void editWage(String wage) {
        tap(By.id("info_wage_edit"));
        type(By.id("info_wage_input"), wage);
        hideKeyboard();
        tap(By.id("info_wage_save"));

    }


}
