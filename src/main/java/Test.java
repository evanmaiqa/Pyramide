import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
  //      driver.get("http://the-internet.herokuapp.com");
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        System.out.println("Title: " + driver.findElement(By.xpath("/html/head/title")).getText());
//        WebElement q = driver.findElement(By.name("q"));
//        q.sendKeys("Opp");
//        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).click();
////        Thread.sleep(2000);
////        driver.findElement(By.name("btnK")).click();
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
//        System.out.println(driver.getTitle());
 //       driver.quit();
    }


}
