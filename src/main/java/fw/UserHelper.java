package fw;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper{
    public UserHelper(WebDriver driver) {
        super(driver);
}
    public void openRegistrationForm() {
        openRegistrationFormm();
    }

    public void openRegistrationFormm() {
        submitLoginn("//a[@href='/register']");
    }

    public void fillRegistrationForm(User user) {
        data(user);
    }

    public void data(User user) {
        submitLoginn("//input[@id='gender-female']");

        type(By.xpath("//input[@id='FirstName']"), user.getFirstName());
        type(By.xpath("//input[@id='LastName']"), user.getLastName());
        fillLogInform(user);
        type(By.xpath("//input[@id='ConfirmPassword']"), user.getPassword());
    }

    public void submitRegistration() {
        submitLoginn("//input[@id='register-button']");
    }

    public boolean isRegistrationSuccess() {
        return isElementPresent(By.xpath("//div[@class='result' and normalize-space(text())='Your registration completed']"));
    }

    public void clickLoginLink() {
        submitLoginn("//a[@href='/login']");
    }

    public void fillLoginForm(User user) {
        fillLogInform(user);
    }

    public void fillLogInform(User user) {
        type(By.xpath("//input[@id='Email']"), user.getEmail());
        type(By.xpath("//input[@id='Password']"), user.getPassword());
    }

    public void submitLogin() {
        submitLoginn("//input[@value='Log in']");
    }

    public void submitLoginn(String xpathExpression) {
        click(By.xpath(xpathExpression));
    }

    public boolean isLogoutLinkPresent() {
        return isElementPresent(By.xpath("//a[@href='/logout']"));
    }

    public void clickLogout() {
        submitLoginn("//a[@href='/logout']");
    }

    public boolean isLoginLinkPresent() {
        return isElementPresent(By.xpath("//a[@href='/login']"));
    }
}


