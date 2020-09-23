package classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleCheckBox {
    @Test
    public void web() throws InterruptedException {
        Boolean a= true;
        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        wd.manage().window().maximize();
        wd.findElement(By.id("isAgeSelected")).click();
        Assert.assertEquals(wd.findElement(By.id("txtAge")).getText(),"Success - Check box is checked");
        Thread.sleep(5000);
        wd.findElement(By.id("isAgeSelected")).click();
        Assert.assertTrue("display: none; ", a);
    }
}
