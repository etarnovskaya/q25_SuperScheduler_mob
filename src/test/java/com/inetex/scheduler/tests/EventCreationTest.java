package com.inetex.scheduler.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EventCreationTest extends TestBase{
    @BeforeMethod
    public void perconditions(){
        if(!app.event().isIconReportPresent()){
            app.user().login("NewYear@gmail.com", "Happy2021");
        }
    }
    @Test
    public void eventCreationtest() throws InterruptedException {

        app.event().initCreation();
        //tapOnPecillButton
        app.event().tapOnPecillButton();
        //fillEventForm
        Thread.sleep(10000);
        app.event().fillCreationForm("Event");
        //ConfirmEventCreation
        app.event().editWage("50");
        app.event().save();
        //isEventPresent
        Thread.sleep(10000);

    }
}
