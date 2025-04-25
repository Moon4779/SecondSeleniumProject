package com.ait.qa55;

import fw.ApplicationManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected ApplicationManager app;

    @BeforeMethod
    public void setUp() {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        app = new ApplicationManager();
        app.init();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();

    }

}
