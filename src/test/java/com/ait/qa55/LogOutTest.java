package com.ait.qa55;

import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogOutTest extends BaseTest {

    @Test
    public void testLogout() {
        app.getUser().clickLoginLink();
        app.getUser().fillLoginForm(new User()
                .setEmail("anna.test2025@example.com")
                .setPassword("Test1234"));
        app.getUser().submitLogin();

        Assert.assertTrue(app.getUser().isLogoutLinkPresent());

        app.getUser().clickLogout();

        Assert.assertTrue(app.getUser().isLoginLinkPresent(), "User didnt log out");
    }
}
