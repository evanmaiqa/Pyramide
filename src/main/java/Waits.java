import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Waits {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("http://localhost:8080/");
        driver.findElement(By.id("j_username")).sendKeys("admin");
        driver.findElement(By.name("j_password")).sendKeys("admin");
        driver.findElement(By.name("Submit")).click();

        List<WebElement> list = driver.findElements(By.className("content-block"));
        for (WebElement webElement : list) {
            System.out.println(webElement.getText());
            System.out.println(webElement.isDisplayed());
            System.out.println(webElement.isEnabled());
            System.out.println(webElement.getSize());
            System.out.println(webElement.isSelected());
            System.out.println("----");
        }

        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='newJob']"))).click();

        driver.quit();

    }
}
