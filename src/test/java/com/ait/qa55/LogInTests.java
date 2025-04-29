package com.ait.qa55;

import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.DataProvider;

public class LogInTests extends BaseTest{

@Test(dataProvider = "validLoginUsers", dataProviderClass = DataProvider.class)
public void testLoginWithValidCredentials(User user) {
    app.getUser().clickLoginLink();
    app.getUser().fillLoginForm(user);
    app.getUser().submitLogin();

    Assert.assertTrue(app.getUser().isLogoutLinkPresent(), "User didn't log in successfully");
}

   // @Test
  //  public void testLoginWithValidCredentials() {
     //   app.getUser().clickLoginLink();
    //    app.getUser().fillLoginForm(new User()
      //          .setEmail("anna.test2025@example.com")
      //          .setPassword("Test1234"));
    //    app.getUser().submitLogin();

    //    Assert.assertTrue(app.getUser().isLogoutLinkPresent(), "User didnt come to sistem");
  //  }
}
