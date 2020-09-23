package classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import kotlin.reflect.KVariance;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*public class Footer {
    public void footer_check() throws InterruptedException {
        List<String> eFooters= new ArrayList<String>(Arrays.asList("My orders", "My credits slips","My addresses","My personal info"));
        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();
        List<String> actualArray = new ArrayList<>();
        List<WebElement> afooters = wd.findElements(By.className("bullet"));
        for( footer : afooters){
            actualArray.add(afooters.gettext());
        }
        Assert.assertEquals(eFooters, actualArray);

    }
}*/


