package selenium_practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {
    @Test
    public void firstBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.gmail.com");

        //driver.findElement(By.id("identifierId")).sendKeys("devrajadhikari333@gmail.com");

        //Thread.sleep(2000);
        //locator
        //1. id:
        WebElement username = driver.findElement(By.id("identifierId"));
        username.sendKeys("devrajadhikari333@gmail.com");
        //Thread.sleep(2000);
        //driver.findElement(By.id("login-username")).sendKeys("devrajadhikari333@gmail.com");

        //2. click
        WebElement clck = driver.findElement(By.className("VfPpkd-RLmnJb"));
        clck.click();

    }
}
