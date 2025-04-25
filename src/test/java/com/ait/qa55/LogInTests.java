package com.ait.qa55;

import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTests extends BaseTest{
    @Test
    public void testLoginWithValidCredentials() {
        app.getUser().clickLoginLink();
        app.getUser().fillLoginForm(new User()
                .setEmail("anna.test2025@example.com")
                .setPassword("Test1234"));
        app.getUser().submitLogin();

        Assert.assertTrue(app.getUser().isLogoutLinkPresent(), "User didnt come to sistem");
    }
}
