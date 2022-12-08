package thispersondoesnotexist;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class people {
    private static void face() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 1);
        driver.get("https://thispersondoesnotexist.com/");
        WebElement facePic = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("face")));
        System.out.println("i. " + facePic.getSize());
        for(int i = 0; i < 1; i++) {
            facePic = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("face")));
            System.out.println(i + ". " + facePic.getSize());
            Thread.sleep(3000);
            driver.navigate().refresh();
        }
        driver.quit();
    }
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        face();
    }
}
