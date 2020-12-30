package com.inetex.scheduler.tests;

import com.inetex.scheduler.manager.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager();

    @BeforeClass
    public void setUp() throws MalformedURLException {
        app.init();

    }

    @AfterClass(enabled = true)
    public  void tearDown(){
        app.stop();
    }

}
