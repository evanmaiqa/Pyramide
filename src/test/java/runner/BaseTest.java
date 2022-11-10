package runner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    static {
 //       WebDriverManager.firefoxdriver().setup();
          WebDriverManager.chromedriver().setup();
//        WebDriverManager.edgedriver().setup();
    }
    @BeforeMethod
    protected void beforeMethod() {
//        driver = new FirefoxDriver();
          driver = new ChromeDriver();
//        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    protected void afterMethod() {
        driver.quit();
    }
    protected WebDriver getDriver() {
        return driver;
    }
}
