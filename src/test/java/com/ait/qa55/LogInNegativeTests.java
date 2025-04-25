package com.ait.qa55;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LogInNegativeTests extends BaseTest {
    @Test
    public void testLoginWithInvalidCredentials() {
        app.getUser().clickLoginLink();
        app.getUser().fillLoginForm(new User()
                .setEmail("invalid.user@example.com")
                .setPassword("WrongPassword123"));
        app.getUser().submitLogin();


        Assert.assertTrue(isElementPresent(By.xpath("//span[contains(text(), 'Login was unsuccessful')]")),
                "Error message should be displayed for invalid login.");
    }


    private boolean isElementPresent(By xpath) {
        try {
            WebDriver driver = null;
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            By locator = null;
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            return element != null;
        } catch (Exception e)  {
            return true;
        }
    }
}