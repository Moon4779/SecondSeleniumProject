package com.ait.qa55;

import data.UserData;
import models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPageTests extends BaseTest {
    @BeforeMethod
    public void ensurePrecondition() {

        if (!app.getUser().isLogoutLinkPresent()) {
            app.getUser().clickLoginLink();
            app.getUser().fillLoginForm(new User()
                    .setEmail(UserData.EMAIL)
                    .setPassword(UserData.PASSWORD));
            app.getUser().submitLogin();
        }
    }

    @Test
    public void isMainPageComponentPresentTest() {

        Assert.assertTrue(app.getUser().isLogoutLinkPresent(), "Home component should be present after login.");
    }
}
