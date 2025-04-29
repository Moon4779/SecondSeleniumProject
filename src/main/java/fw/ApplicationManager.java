package fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.MyListener;

import java.time.Duration;

public class ApplicationManager {

    WebDriver driver;
    Logger logger = LoggerFactory.getLogger(ApplicationManager.class);

    private  UserHelper user;
    public void init() {
        WebDriver originalDriver = new ChromeDriver();
        logger.info("Test started in Chrome browser");
        WebDriverListener listener = new MyListener();
        driver = new EventFiringDecorator<>(listener).decorate(originalDriver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        logger.info("Current URL --> " + driver.getCurrentUrl());
        user = new UserHelper(driver);
    }

    public void stop() {
        driver.quit();
    }

    public UserHelper getUser() {
        return user;
    }
}
