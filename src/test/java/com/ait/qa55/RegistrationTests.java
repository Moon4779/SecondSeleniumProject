package com.ait.qa55;

import data.RegisterData;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseTest {
    @Test
    public void testUserRegistration() {
        app.getUser().openRegistrationForm();
        app.getUser().fillRegistrationForm(new User()
                .setFirstName(RegisterData.FIRST_NAME)
                .setLastName(RegisterData.LAST_NAME)
                .setEmail(RegisterData.EMAIL)
                .setPassword(RegisterData.PASSWORD));
        app.getUser().submitRegistration();

        Assert.assertTrue(app.getUser().isRegistrationSuccess(), "Registration is failed!");
    }

}
