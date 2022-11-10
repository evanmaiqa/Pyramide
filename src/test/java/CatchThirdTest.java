import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

import java.util.List;

public class CatchThirdTest extends BaseTest {
    @Test
    public void testCatchThird(){
        getDriver().get("https://www.ebay.com/");
        getDriver().findElement(By.id("gh-ac")).sendKeys("iphone se 3rd gen");
        getDriver().findElement(By.id("gh-btn")).click();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://www.ebay.com/sch/i.html?_from=R40&_trksid=p2380057.m570.l1313&_nkw=iphone+se+3rd+gen&_sacat=0");
        String currentWindow = getDriver().getWindowHandle();
        List<WebElement> listOfElements = getDriver().findElements(By.className("s-item__image-img"));
        WebElement element = listOfElements.get(10);
        Actions action = new Actions(getDriver());
        action.moveToElement(element).perform();
        element.click();
        for (String winHandle : getDriver().getWindowHandles()) {
            getDriver().switchTo().window(winHandle);
        }
        Assert.assertNotEquals(getDriver().findElement(By.id("prcIsum")).getAttribute("content"), "269.90");
        getDriver().close();
        getDriver().switchTo().window(currentWindow);
        Assert.assertEquals(getDriver().getTitle(), "iphone se 3rd gen | eBay");
    }
    @Test
    public void alinkTest() {
        getDriver().get("https://www.rammstein.de/en/live/");

        List<WebElement> linkList = getDriver().findElements(By.xpath("//div[@class=' flex whitespace-normal pt-2 text-left lg:w-[100px] lg:pt-0']"));

        Assert.assertEquals(linkList.get(6).getAttribute("innerHTML"), "Munich");
    }

    @Test
    public void linkTest() {
        getDriver().get("https://www.rammstein.de/en/live/");

        List<WebElement> linkList = getDriver().findElements(By.cssSelector("div[class=' flex whitespace-normal pt-2 text-left lg:w-[100px] lg:pt-0']"));

        Assert.assertEquals(linkList.get(6).getAttribute("innerHTML"), "Munich");
    }
}
