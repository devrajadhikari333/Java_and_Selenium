package classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class missed {
    @Test
    public void web() throws InterruptedException {
        int target = 53;
        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();
        wd.findElement(By.className("sf-with-ul")).click();
        WebElement slider=wd.findElement(By.cssSelector(".ui-slider-range.ui-widget-header.ui-corner-all"));
        //WebElement sliderHandle=wd.findElement(By.className("ui-slider-handle ui-state-default ui-corner-all"));
       Actions move = new Actions(wd);
       Thread.sleep(5000);
       int i=2;
        if (i==1) { }
        if (i==2) {
            move.dragAndDropBy(slider,180,0).build().perform();
        }
        Thread.sleep(3000);
        Assert.assertEquals(wd.findElement(By.id("layered_price_range")).getText(),"$53.00 - $53.00");
    }
}
