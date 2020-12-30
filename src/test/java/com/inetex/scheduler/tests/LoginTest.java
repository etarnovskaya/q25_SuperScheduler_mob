package com.inetex.scheduler.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends  TestBase{
    @Test
    public void testLogin(){
        app.user().login("NewYear@gmail.com", "Happy2021");

        Assert.assertTrue(app.event().isIconReportPresent());
    }
}
